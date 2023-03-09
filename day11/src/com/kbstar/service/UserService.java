package com.kbstar.service;

import java.util.ArrayList;
import java.util.List;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Msg;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class UserService implements CRUDService<String, UserDTO> {
	
	DAO<String, UserDTO> userDao;
	Notification notification;

	public UserService() {
		userDao = new UserDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception{
		// 비밀번호 암호화 
		try {
			userDao.insert(v);  // 여기서 발생하는 에러는 app으로 던져짐
			notification.sendEmail(v.getEmail(), Msg.registerMsg1);
			notification.sendSMS(v.getContact(), Msg.registerMsg2);
		} catch (Exception e) {
			throw new Exception("회원가입 실패 (ER0001)");  
			// app으로 에러가 던져질 때 데이터베이스 상의 오류(UserDao 상에 정의된 에러메시지)가 그대로 노출되게 됨 -> 여기서 에러메시지를 한번 더 가공)
		}  
	}

	@Override
	public void remove(String k) throws Exception {
		UserDTO user = null;
		try {
			user = userDao.select(k);
		} catch (Exception e) {
			throw new Exception("오류입니다. 탈퇴가 중단됩니다.");
		}
		userDao.delete(k);
		notification.sendEmail(user.getContact(), Msg.removeMsg1);
		notification.sendSMS(user.getContact(), Msg.removeMsg2);
		
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try {
			userDao.update(v);
		} catch (Exception e) {
			throw new Exception("수정 오류입니다.");
		}
		
	}

	@Override
	public UserDTO get(String k) throws Exception {
		UserDTO obj = null;
		obj = userDao.select(k);
		return obj;
	}

	@Override
	public List<UserDTO> get() throws Exception{
		List<UserDTO> list = null;
		try {
			list = userDao.select();
		} catch (Exception e) {
			throw new Exception("조회 오류");
		}
		return list;
	}

}
