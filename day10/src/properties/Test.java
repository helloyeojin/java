package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file.txt";
		FileInputStream in = null;
		try {
			in = new FileInputStream(fileName);   //file.txt라는 파일을 읽어들여서 
			props.load(in);   //파일 안에 있는 내용을 담는다 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {   //위에 있는 try구문 안에 in.close()를 써버리면 props.load(in)에서 에러가 나면 닫히지가 않음!
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String ip = props.getProperty("IP_ADDR");   //담긴 내용 안에서 IP_ADDR이라는 내용을 읽어서 
		System.out.println(ip);   //출력한다  
	}

}
