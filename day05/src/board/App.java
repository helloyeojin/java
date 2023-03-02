package board;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service();
		while(true) {
			System.out.println("Input cmd(r, m, d, g, q)");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye.");
				break;
			} else if(cmd.equals("r")) {
				System.out.println("Write Contents");
				String content = sc.next();
				service.register(content);
			} else if(cmd.equals("g")) {
				System.out.println("Input Number");
				int num = Integer.parseInt(sc.next());
				String result = service.get(num);
				System.out.println(result);
			} else if(cmd.equals("d")) {
				System.out.println("Input Number");
				int num = Integer.parseInt(sc.next());
				service.remove(num);
				System.out.println("Deleted");
			} else if(cmd.equals("m")) {
				System.out.println("Input Number");
				int num = Integer.parseInt(sc.next());
				System.out.println("Write New Contents");
				String content = sc.next();
				service.modify(num, content);
				System.out.println(num + "Modified");
			}
				
		}
		sc.close();
	}

}
