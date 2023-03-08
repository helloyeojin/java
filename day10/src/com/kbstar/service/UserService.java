package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service<String, UserDTO> {
	
	DAO<String, UserDTO> dao;  // DAO가 필요합니다~
	
	public UserService() {
		dao = new UserDAO();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		System.out.println("Security Check");
		dao.insert(v);
		//throws Exception을 쓰지 않고 여기에 try catch 구문을 쓰면 여기서 발생한 문제를 여기에서 바로 처리해버리지만 App으로는 가지 않게됨
		//BUT 여기서 처리 안하고 이 문제를 다른 쪽으로(App으로) 던지겠다 = throws Exception 
		System.out.println("Send mail");
		System.out.println("Send SMS");
	}

	@Override
	public void remove(String k) throws Exception{
		try {
			dao.delete(k);
		} catch (Exception e) {
			throw e;
			//그냥 다른 쪽으로 던져버리기만 하면 문제해결이 하나도 안되니까 이런 식으로 try catch를 같이 써서 로그 등등을 한번 찍을 수 있음
			//무턱대고 던지는 것보다 이게 더 좋은 코드
		}
		System.out.println("Send SMS");
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw e;
		}
		System.out.println("Send mail");	
	}
}

