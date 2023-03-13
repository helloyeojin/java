package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class AccountService implements CRUDService<String, AccountDTO>{
	
	DAO<String, AccountDTO> accDao;
	Notification notification;

	public AccountService() {
		accDao = new AccountDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(AccountDTO v) throws Exception {
		try {
			accDao.insert(v);
			System.out.println(v+" 생성 완료");
		} catch (Exception e) {
			throw new Exception("계좌 생성 실패 (ER10001)");
		}
		
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			AccountDTO acc = accDao.select(k);
			accDao.delete(k);
			System.out.println(acc+" 삭제 완료");
		} catch (Exception e) {
			throw new Exception("계좌 삭제 실패 (ER10002)");
		}
	}

	@Override
	public void modify(AccountDTO v) throws Exception {
		try {
			accDao.update(v);
			System.out.println(v+" 업데이트되었습니다.");
		} catch (Exception e) {
			throw new Exception("정보 업데이트 실패 (ER10003)");
		}
	}

	@Override
	public AccountDTO get(String k) throws Exception {
		AccountDTO obj = null;
		try {
			obj = accDao.select(k);
		} catch (Exception e) {
			throw new Exception("계좌 조회 실패 (ER10004)");
		}
		return obj;
	}

	@Override
	public List<AccountDTO> get() throws Exception {
		List<AccountDTO> list = null;
		try {
			list = accDao.select();
		} catch (Exception e) {
			throw new Exception("계좌 조회 실패 (ER10004)");
		}
		return list;
	}

}
