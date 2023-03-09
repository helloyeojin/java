package properties; 

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetIpAddress {
	public static String getIpAddress() {
		String ipAddr = "";
		Properties props = new Properties();
		String fileName = "file.txt";
		try (FileInputStream in = new FileInputStream(fileName)) {  //예외발생 여부와 관계없이 try-catch 완료되면 자동으로 close 실행 
			props.load(in);  
		} catch (IOException e) {
			System.out.println("문제발생!");
		}
		ipAddr = props.getProperty("IP_ADDR");   
		return ipAddr;
	}
}
