package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test2 {

	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file2.txt";
		try (FileInputStream in = new FileInputStream(fileName)) {  //예외발생 여부와 관계없이 try-catch 완료되면 자동으로 close 실행 
			props.load(in);  
		} catch (IOException e) {
			System.out.println("문제발생!");
			return;  //문제발생하면 -> 종료해라! 
		}
		String ip = props.getProperty("IP_ADDR");   
		int port = Integer.parseInt(props.getProperty("PORT"));   
		System.out.printf("%s 서버로 %d 포트로 접속", ip,port);  
	}

}
