package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.TransactionDAO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class TransactionService implements CRUDService<String, TransactionDTO>{

	DAO<String, TransactionDTO> trDao;
	
	public TransactionService() {
		trDao = new TransactionDAO();
	}
	
	@Override
	public void register(TransactionDTO v) throws Exception {
		try {
			trDao.insert(v);
			System.out.println(v+" 등록 완료");
		} catch (Exception e) {
			throw new Exception("거래 실패");
		}
		
	}

	@Override
	public void remove(String k) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(TransactionDTO v) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TransactionDTO get(String k) throws Exception {
		TransactionDTO obj = null;
		try {
			obj = trDao.select(k);
		} catch (Exception e) {
			throw new Exception("거래내역 조회 실패");
		}
		return obj;
	}

	@Override
	public List<TransactionDTO> get() throws Exception {
		List<TransactionDTO> list = null;
		try {
			list = trDao.select();
		} catch (Exception e) {
			throw new Exception("거래내역 조회 실패");
		}
		return list;
	}

}
