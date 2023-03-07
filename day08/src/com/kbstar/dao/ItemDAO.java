package com.kbstar.dao;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO>{
	//DAO를 설계할 때는 아이템에서 사용할지 어드민에서 사용할지 어쩔지 모르기 때문에 범용적으로 설계하는 것이 제네릭 
	//k와 v에다가 본인이 원하는 값을 쓰면 됨 
	//키값으로는 primitive type으로는 쓸 수 없어서 int로 쓰면 안되고 integer라고 써줘야함 

	@Override
	public void insert(ItemDTO v) {
		connect();
		System.out.println(v);
		System.out.println("Inserted!");
		close();
	}

	//int id = 100;
	@Override
	public void delete(Integer k) {  //primitive type이 어떻게 객체로 들어갈 수 있나요?? 
		connect();
		System.out.println(k);
		System.out.println("Deleted!");
		close();
	}

	@Override
	public void update(ItemDTO v) {
		System.out.println(v);
		System.out.println("Updated!");
	}
	

}
