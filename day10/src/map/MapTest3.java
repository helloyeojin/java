package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest3 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		// .values()의 리턴타입은 collection 
		// 키값은 상관 안하고 map에 있는 value들을 출력하는 것 
		Collection<String> col = map.values();
		System.out.println(col.size());
		
		for(String data: col) {
			System.out.println(data);
		}
	}

}
