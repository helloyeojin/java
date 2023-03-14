package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Item> service = new ItemCRUDServiceImpl();
		
		Item obj = new Item("더보이즈짱", 20000, 3.2); // 여기서 상품번호를 만들거나 하면 그게 다 노출이 됨 
		try {
			service.register(obj);
			System.out.println("성공");
		} catch (Exception e) {  // 여기서는 실제로 고객에게 메시지를 노출시켜야 함 
			System.out.println(e.getMessage());
		}
		

	}

}
