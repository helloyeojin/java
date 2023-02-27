package array;

import java.util.Scanner;

public class P122 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input Command[q, i, d, s]");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Quit...");
				break;
			} else if(cmd.equals("a1")) {
				
			} else if(cmd.equals("a2")) {
				
			} else if(cmd.equals("a3")) {
				
			} else if(cmd.equals("a4")) {
				
			} else {
				System.out.println("Invalid Command...");
				System.out.println("Try Again.");
			}
		}
		System.out.println("Bye...");
		sc.close();
	}
}
