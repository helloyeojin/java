package com.kbstar.test;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserCRUDServiceImpl;

public class UserInsertTest {

	public static void main(String[] args) {
		CRUDService<String, UserDTO> crudService = new UserCRUDServiceImpl();

		UserDTO user = new UserDTO("id01", "111", "더보이즈", "1105@gmail.com", "01011051105");
		try {
			crudService.register(user);
			System.out.println("성공");
		} catch (Exception e) { // 여기서는 실제로 고객에게 메시지를 노출시켜야 함
			System.out.println(e.getMessage());
		}
	}
}
