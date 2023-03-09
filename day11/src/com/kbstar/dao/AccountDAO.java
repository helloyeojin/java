package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;

public class AccountDAO implements DAO<String, AccountDTO> {
	
	HashMap<String, AccountDTO> db;

	public AccountDAO() {
		db = new HashMap<String, AccountDTO>();
	}

	@Override
	public void insert(AccountDTO v) throws Exception {
		db.put(v.getAccNo(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		db.remove(k);
	}

	@Override
	public void update(AccountDTO v) throws Exception {
		db.put(v.getAccNo(), v);
	}

	@Override
	public AccountDTO select(String k) throws Exception {
		AccountDTO obj = null;
		obj = db.get(k);
		if (obj == null) {
			throw new Exception("존재하지 않는 계좌입니다.");
		}
		return obj;
	}

	@Override
	public List<AccountDTO> select() throws Exception {
		List<AccountDTO> list = new ArrayList<AccountDTO>();  // List는 인터페이스라 객체 생성이 안돼서 뒤에는 ArrayList로 써줘야됨!
		Collection<AccountDTO> col = db.values();
		for(AccountDTO obj:col) {
			list.add(obj);
		}
		return list;
	}

}
