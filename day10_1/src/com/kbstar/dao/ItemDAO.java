package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.ItemDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO> {

	HashMap<Integer, ItemDTO> db = null;
	
	public ItemDAO() {
		db = new HashMap<>();
	}
	
	@Override
	public void insert(ItemDTO v) throws Exception {
		if(db.containsKey(v.getId())) {
			throw new Exception("이미 존재하는 상품코드입니다.");
		}
		db.put(v.getId(), v);
		
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(!db.containsKey(v.getId())) {
			throw new Exception("존재하지 않는 상품코드입니다.");
		}
		db.put(v.getId(), v);
		
	}

	@Override
	public void delete(Integer k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("존재하지 않는 상품코드입니다.");
		}
		db.remove(k);
		
	}

	@Override
	public ItemDTO select(Integer k) throws Exception {
		ItemDTO item = null;
		if(!db.containsKey(k) ) {
			throw new Exception("존재하지 않는 상품코드입니다.");                           
		}
		item = db.get(k);
		return item;
	}

	@Override
	public List<ItemDTO> select() throws Exception {
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		Collection<ItemDTO> col = db.values();
		for (ItemDTO i:col) {
			list.add(i);
		}
		return list;
	}

}
