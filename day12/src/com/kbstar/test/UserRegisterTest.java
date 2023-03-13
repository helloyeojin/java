package com.kbstar.test;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserRegisterTest {

	public static void main(String[] args) {
		CRUDService<String, UserDTO> service = new UserService();
		UserDTO obj = new UserDTO("id01", "pwd01", "mango", "uhmango@gmail.com", "010-7979-5757");
		UserDTO obj2 = new UserDTO("id01", "pwd02", "mango", "uhmango@gmail.com", "010-7979-5757");
		
		try {
			service.register(obj);
			System.out.println("----------------------------------------------------");
			service.register(obj2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
