package p214;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		double a = 0;   //여기랑 밑줄 int를 double로 바꾸면 Infinity 나옴 
		double result = 10 / a;
		System.out.println(result);
		try {
			Thread.sleep(1000);    //여기서 1초간 멈췄다가 진행 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		InputStreamReader ir = new InputStreamReader(System.in);
		System.out.println("Input Character...");
		int b = 0;
		try {
			b = ir.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(b);
		System.out.println("End...");
	}
}
