/**
 * 
 */
package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

/**
 * @author siyo
 *
 */
public class BankServiceImpl implements BankService<UserDTO, AccountDTO, TransactionDTO, String, String> {
   
   DAO<String, UserDTO> userDao;
   DAO<String, AccountDTO> accountDao;
   DAO<String, TransactionDTO> trDao;
   Notification notification;
   
   public BankServiceImpl() {
      userDao = new UserDAO();
      accountDao = new AccountDAO();
      trDao = new TransactionDAO();
      notification = new NotificationImpl();
   }

   @Override
   public void register(UserDTO v) throws Exception {
      try {
         userDao.insert(v);
      } catch (Exception e) {
         throw new Exception("등록 오류");
      }
      notification.sendEmail(v.getEmail(), "축하합니다.");
      notification.sendSMS(v.getContact(), "축하합니다.");
   }

   @Override
   public UserDTO login(String K, String p) throws Exception {
      UserDTO user = null;
      user = userDao.select(K);
      if(user != null) { 
         if(user.getPwd().equals(p)) {     // DB의 pwd 와 내가 입력한 pwd 비교
            System.out.println("OK");
         } else { 
            throw new Exception("로그인 실패..."); // DB의 pwd 와 내가 입력한 pwd 가 다른 경우
         }
      } else {
         throw new Exception("로그인 실패..."); // DB에 해당 ID가 존재하지 않는 경우
      }
      return user;
   }

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user = null;
		try {
			user = userDao.select(k);
		} catch (Exception e) {
			throw new Exception("고객정보 조회 실패");
		}
		return user;
	}

	@Override
	public void makeAccount(String k, double balance) throws Exception {
		String accNo = MakeAccountNumber.makeAccNum();
		AccountDTO account = new AccountDTO(accNo, balance, k);
		accountDao.insert(account);
		UserDTO user = userDao.select(k);
		notification.sendEmail(user.getEmail(), accNo+" 계좌를 생성하셨습니다.");
		notification.sendSMS(user.getContact(), accNo+" 계좌를 생성하셨습니다.");
	}

	@Override
	public List<TransactionDTO> getAllTr(String acc) throws Exception {
		return trDao.search(acc);
	}

	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
		//sendAcc로 계좌정보 가져옴 -> 현재 잔액 정보 가져와서 balance 빼기 -> 거래내역 추가 
		//receiveAcc로 계좌정보 가져옴 -> 현재 잔액 정보 가져와서 balance 더하기 -> 거래내역 추가 
		
		System.out.println("금결원 전송...");
		//계좌 정보 수정 
		//계좌 잔액 정보를 조회하고 잔액에서 이체하는 금액을 차감한 잔액으로 수정 
		AccountDTO acc = null;
		acc = accountDao.select(sendAcc);
		double postBalance = acc.getBalance() - balance;
		acc.setBalance(postBalance);
		accountDao.update(acc);
		//거래내역 추가 
		TransactionDTO trans = new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, balance, "o", desc);
		trDao.insert(trans);
		//SMS, email 전송
		String uid = acc.getHolder();
		UserDTO u = userDao.select(uid);
		notification.sendEmail(u.getEmail(), sendAcc+" 계좌에서 "+balance+"원이 출금되었습니다.");
		notification.sendSMS(u.getContact(), sendAcc+" 계좌에서 "+balance+"원이 출금되었습니다.");
	}

	@Override
	public List<AccountDTO> getAllAccount(String k) throws Exception {
		List<AccountDTO> list = null;
		list = accountDao.search(k);
		return list;
	}

}
