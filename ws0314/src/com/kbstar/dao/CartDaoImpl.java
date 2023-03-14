package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CartDaoImpl implements DAO<String, String, Cart> {
	
	public CartDaoImpl() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공.");
	}

	@Override
	public void insert(Cart v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartInsertSql)) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getUserId());
			pstmt.setString(3, v.getItemId());
			pstmt.setInt(4, v.getCnt());
			pstmt.executeQuery();
		} catch(Exception e) {
			throw e;
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try(Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartDeleteSql)) {
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate();
			if(result == 0) {
				throw new Exception("존재하지 않는 아이디입니다.");
			}
		} catch(Exception e) {
			throw e;
		}
		
	}

	@Override
	public void update(Cart v) throws Exception {
		try(Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartUpdateSql)) {
			pstmt.setString(1, v.getUserId());
			pstmt.setString(2, v.getItemId());
			pstmt.setInt(3, v.getCnt());
			pstmt.setString(4, v.getId());
			int result = pstmt.executeUpdate();
			if(result == 0) {
				throw new Exception("존재하지 않는 아이디입니다.");
			}
		} catch(Exception e) {
			throw e;
		}
	}

	@Override
	public Cart select(String k) throws Exception {
		Cart cart = null;
		try(Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartSelectSql)) {
			pstmt.setString(1, k);
			 try(ResultSet rset = pstmt.executeQuery()) {
				 rset.next();
				 
				 String id = rset.getString("id");
				 String userId = rset.getString("user_id");
				 String itemId = rset.getString("item_Id");
				 int cnt = rset.getInt("cnt");
				 Date regdate = rset.getDate("regdate");
				 cart = new Cart(id, userId, itemId, cnt, regdate);
			 } catch(Exception e) {
				 throw e;
			 }
		} catch(Exception e) {
			throw e;
		}
		return cart;
	}

	@Override
	public List<Cart> selectAll() throws Exception {
		List<Cart> list = new ArrayList<>();
		try(Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.cartSelectAllSql)) {
			try(ResultSet rset = pstmt.executeQuery();) {
				while(rset.next()) {
					Cart cart = null;
					String id = rset.getString("id");
					String userId = rset.getString("user_Id");
					String itemId = rset.getString("item_Id");
					int cnt = rset.getInt("cnt");
					Date regdate = rset.getDate("regdate");
					cart = new Cart(id, userId, itemId, cnt, regdate);
					list.add(cart);
				}
			} catch(Exception e) {
				throw e;
			}
		} catch(Exception e) {
			throw e;
		}
		return list;
	}

	@Override
	public List<Cart> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
