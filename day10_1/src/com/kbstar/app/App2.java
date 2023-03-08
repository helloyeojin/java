package com.kbstar.app;

import java.util.List;
import java.util.Scanner;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class App2 {

	public static void main(String[] args) {
		
		DAO<Integer, ItemDTO> itemDao = new ItemDAO();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input command(q, i, d, u, s, sa)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			} else if(cmd.equals("i")) {
				System.out.println("Input ID");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME");
				String name = sc.next();
				System.out.println("Input PRICE");
				double price = Double.parseDouble(sc.next());
				System.out.println("Input Quantity");
				int qt = Integer.parseInt(sc.next());
				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					itemDao.insert(item);
					System.out.println(item+"가 추가되었습니다.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}else if(cmd.equals("d")) {
				System.out.println("Input ID");
				int id = Integer.parseInt(sc.next());
				try {
					itemDao.delete(id);
					System.out.println("상품 "+id+"번이 삭제 완료되었습니다.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else if(cmd.equals("u")) {
				System.out.println("Input ID");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input NAME");
				String name = sc.next();
				System.out.println("Input PRICE");
				double price = Double.parseDouble(sc.next());
				System.out.println("Input Quantity");
				int qt = Integer.parseInt(sc.next());
				ItemDTO item = new ItemDTO(id, name, price, qt);
				try {
					itemDao.update(item);
					System.out.println(item+" 상품이 업데이트 되었습니다.");
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else if(cmd.equals("s")) {
				System.out.println("Input ID");
				int id = Integer.parseInt(sc.next());
				ItemDTO item = null;
				try {
					item = itemDao.select(id);
					System.out.println(item);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else if(cmd.equals("sa")) {
				List<ItemDTO> list = null;
				try {
					list = itemDao.select();   // list의 모든 사용자 정보가 담겨져서 날라온다...
					if(list.size() == 0) {
						System.out.println("상품이 존재하지 않습니다.");
					}
					else if(list.size() != 0) {
						System.out.println("전체 상품 리스트: ");
						for(ItemDTO i:list) {
							System.out.println(i);
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		sc.close();
	}
}
