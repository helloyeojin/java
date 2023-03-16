package com.kbstar.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class AccountDaoImpl implements DAO<String, AccountDTO> {


     public AccountDaoImpl() {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		// System.out.println("Driver Loading 성공.");
	}
     
     
	@Override
	public void insert(AccountDTO v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.AccInsertSql)) {
			pstmt.setString(1, v.getAccNo());
			pstmt.setDouble(2, v.getBalance());
			pstmt.setString(3, v.getaccHolder());
			int result = pstmt.executeUpdate();
			if (result != 0) {
				throw new Exception("이미 존재하는 계좌입니다.");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	
	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.AccDeleteSql);) {
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("존재하지 않는 계좌입니다.");
			}
		} catch (Exception e1) {
			throw e1;
		}

	}

	@Override
	public void update(AccountDTO v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.AccUpdateSql);) {
			pstmt.setString(1, v.getAccNo());
			pstmt.setDouble(2, v.getBalance());
			pstmt.setString(3, v.getaccHolder());
			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("없음");
			}
		} catch (Exception e1) {
			throw e1;
		}
	}

	@Override
	public AccountDTO select(String k) throws Exception {
		AccountDTO account = null;
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.AccSelectSql);) {
			pstmt.setString(1, k);

			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next();

				String accNo = rset.getString("accNo");
				double balance = rset.getDouble("balance");
				String accholder = rset.getString("accholder");
				Date madeDate = rset.getDate("madeDate");
				
				account = new AccountDTO(accNo, balance, accholder, madeDate);
				System.out.println(account);
//				list.add(item);}
			} catch (Exception e) {
				throw e;
				// e.printStackTrace();
			}
		} catch (Exception e) {
			throw e; //
//			e.printStackTrace(); //네트워크 문제일때
		}
		return account;
	}

	@Override
	public List<AccountDTO> selectAll() throws Exception {
		List<AccountDTO> list = new ArrayList<>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.myAccSelectAllSql)) {
			try (ResultSet rset = pstmt.executeQuery()) {
				while (rset.next()) {
					AccountDTO account = null;
					String accNo = rset.getString(" accNo");
					double balance = rset.getDouble("balance");
					String accholder = rset.getString("accholder");
					Date madeDate = rset.getDate("madeDate");
					account = new AccountDTO( accNo, balance, accholder, madeDate);
					list.add(account);
				}
				if (list.size() == 0) {
					throw new Exception("DB 에러 : 리스트 미존재");
				}
			}
		} catch (Exception e) {
			throw new Exception("DB 에러 : 시스템 에러");
		}
		return list;
	}
//
//	@Override
//	public List<AccountDTO> select() throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
