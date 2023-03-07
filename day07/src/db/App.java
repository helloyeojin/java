package db;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		DAO dao = new MariaDBDAO();  // 만약에 데이터베이스를 바꾼다고 하면 여기만 바꿔주면 됨!
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input command(q, i, d, u)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye");
				break;
			} else if(cmd.equals("i")) {
				System.out.println("Input ID");
				String id = sc.next();
				System.out.println("Input PWD");
				String pwd = sc.next();
				System.out.println("Input NAME");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				dao.insert(user);  // 자바의 모든 객체는 Object로부터 상속받았으므로 user도 넣어줄 수 있음 
			}else if(cmd.equals("d")) {
				System.out.println("Input ID");
				String id = sc.next();
				dao.delete(id);  // 자바의 모든 객체는 Object로부터 상속받았기 때문에 String값도 넣을 수 있음 
			} else if(cmd.equals("u")) {
				System.out.println("Input ID");
				String id = sc.next();
				System.out.println("Input PWD");
				String pwd = sc.next();
				System.out.println("Input NAME");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				dao.update(user);
			}
		}
		sc.close();
	}
		
}
