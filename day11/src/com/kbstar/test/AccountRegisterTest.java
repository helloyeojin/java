package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountService;

public class AccountRegisterTest {

	public static void main(String[] args) {
		CRUDService<String, AccountDTO> service = new AccountService();
		AccountDTO obj1 = new AccountDTO("101", 10000, "uhmango");
		AccountDTO obj2 = new AccountDTO("102", 20000, "uhkiwi");
		
		try {
			service.register(obj1);
			service.register(obj2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		AccountDTO acc = null;
		try {
			acc = service.get("101");
			System.out.println(acc);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<AccountDTO> list = null;
		try {
			list = service.get();
			for (AccountDTO a:list) {
				System.out.println(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			service.remove("102");
			System.out.println(service.get("102"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
