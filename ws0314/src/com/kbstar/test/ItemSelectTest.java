package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemSelectTest {
	public static void main(String[] args) {
		CRUDService<String, Item> service = new ItemCRUDServiceImpl();

		try {
			Item item = service.get("2023314642100");

			System.out.println(item.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}