package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
		
		Cust cust = new Cust("id99", "안녕", "연락plz", 30);
		try {
			crudService.get("id15");;
			System.out.println("성공");
		} catch (Exception e) {  // 여기서는 실제로 고객에게 메시지를 노출시켜야 함 
			System.out.println(e.getMessage());
		}
		

	}

}
