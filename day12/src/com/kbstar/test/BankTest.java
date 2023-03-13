package com.kbstar.test;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.service.BankServiceImpl;

public class BankTest {

	public static void main(String[] args) {
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String> service = new BankServiceImpl(); 

		// Register
		UserDTO user = new UserDTO("id01", "pwd01", "name", "a@naver.com", "123-4567");
		try {
			service.register(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// Login
		String id = "";
		String pwd = "";
		UserDTO loginUser = null;
		try {
			loginUser = service.login(id, pwd);
			System.out.println("낯선 곳에 당도한 것을 환영하오 이방인이여");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
