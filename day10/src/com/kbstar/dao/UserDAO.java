package com.kbstar.dao;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO> {  // DAO를 만들 때 key값은 String, value값은 UserDTO를 넣겠다 = 제네릭

	@Override
	public void insert(UserDTO v) throws Exception{
		if(v.getId().equals("id01")) {
			throw new Exception("ER04");
		}
		System.out.println(v.getId()+"님이 저장되었습니다.");
	}

	@Override
	public void delete(String k) throws Exception{
		if(k.equals("id01")) {
			throw new Exception("ER05");
		}
		System.out.println(k+"님이 삭제되었습니다.");
	}

	@Override
	public void update(UserDTO v) throws Exception{
		if(v.getId().equals("id01")) {
			throw new Exception("ER06");
		}
		System.out.println(v.getId()+"님의 정보가 수정되었습니다.");
		
	}
}
