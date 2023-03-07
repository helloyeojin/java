package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;

public class ItemService implements Service<Integer, ItemDTO>, SearchService {

	DAO<Integer, ItemDTO> dao;  // DAO<Integer, ItemDTO>의 형태로 dao를 사용하겠다~
	
	public ItemService() {
		dao = new ItemDAO();  // 상위 클래스(인터페이스) 객체에 하위 클래스 객체를 넣을 수 있다! 
	}
	
	@Override
	public void register(ItemDTO v) {
		System.out.println(v+" Data Check!");
		dao.insert(v);
		System.out.println("Send SMS!");
	}

	@Override
	public void remove(Integer k) {
		System.out.println(k+" Data Check!");
		dao.delete(k);
		System.out.println("Send SMS!");
		
	}

	@Override
	public void modify(ItemDTO v) {
		System.out.println(v+" Data Check!");
		dao.update(v);
		System.out.println("Send SMS!");
	}

	@Override
	public void search() {
		System.out.println("Item Search!");
	}

	//public void search() {  
		// Service 파일에 기능 추가를 안하고 여기에만 넣으면 app에서 ItemService service = new ItemService();로 불러와서 써야함 
		//System.out.println("Search!");
	//}

//	@Override
//	public void search() {
//		System.out.println("Search!");
//		
//	}
}
