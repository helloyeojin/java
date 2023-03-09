package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserGetTest {

	public static void main(String[] args) {
		CRUDService<String, UserDTO> service = new UserService();
		UserDTO obj1 = new UserDTO("id01", "pwd01", "mango1", "uhmango1@gmail.com", "010-7979-5757");
		UserDTO obj2 = new UserDTO("id02", "pwd02", "mango2", "uhmango2@gmail.com", "010-7979-5758");
		UserDTO obj3 = new UserDTO("id03", "pwd03", "mango3", "uhmango3@gmail.com", "010-7979-5759");
		
		try {
			service.register(obj1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		UserDTO user = null;
		try {
			user = service.get("id01");
			System.out.println(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// Employee e = new Manager();
		// List list = new ArrayList(); 하위 객체 상위 객체 호환 
		List<UserDTO> list = null;
		try {
			list = service.get();
			for (UserDTO u:list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// remove() test ----------------------------------------------------------------
		try {
			service.remove("id05");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
