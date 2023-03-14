package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectAllTest {

   public static void main(String[] args) {
      // Driver Loading
      try {
         Class.forName("oracle.jdbc.OracleDriver");
      } catch (ClassNotFoundException e) {
         System.out.println("Driver가 없습니다.");
         e.printStackTrace();
         return;
      }
      System.out.println("Driver Loading 성공.");
      
      // Connect
      String id = "bank"; // workspace
      String pwd = "111111";
      String url = "jdbc:oracle:thin:@172.16.21.69:1521:XE";
      String selectAllSql = "SELECT *  FROM cust";
      
      // Statement 생성 - SQL
      // SQL 전송

      try (Connection con = DriverManager.getConnection(url, id, pwd);
            PreparedStatement pstmt = con.prepareStatement(selectAllSql)) {   
    
    	  
    	  try(ResultSet rset = pstmt.executeQuery()){
    		  while(rset.next()) {
    			  rset.next();   // 커서를 한번 옆으로 넘겨서 실제 값이 있는 칸으로 이동..?
        		  String db_id = rset.getString(1);
        		  String db_pwd = rset.getString(2);
        		  String name = rset.getString(3);
        		  int age = rset.getInt(4);
        		  System.out.println(db_id+" "+name+" "+age);
    		  } 
    	  } catch(SQLException e) {
    		  e.printStackTrace();
    	  }
          
          
         
      } catch (SQLException e1) {
       
      } 

   }

}