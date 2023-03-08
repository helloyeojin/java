package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.kbstar.dto.UserDTO;

public class MapTest4 {

	public static void main(String[] args) {
		Map<String, UserDTO> db = new HashMap<String, UserDTO>();
		db.put("id01", new UserDTO("id01", "pwd01", "mango"));  // id01 -> primary key값
		db.put("id02", new UserDTO("id02", "pwd02", "kiwi"));
		db.put("id03", new UserDTO("id03", "pwd03", "raspberry"));
		
		UserDTO u = db.get("id02");  // 리턴되는 값은 UserDTO니까 UserDTO로 받아야됨 
		System.out.println(u);
		
		///// 수정 /////
		UserDTO uu = new UserDTO("id02", "0000", "kiwi");
		db.put(uu.getId(), uu);  // uu의 아이디값에 해당하는 데이터를 uu로 새롭게 갈아치워라~ 머 그런 뜻 
		
		System.out.println("---------------------------------------------");
		
		Collection<UserDTO> col = db.values();
		for(UserDTO user:col) {
			System.out.println(user);
		}
	}

}
