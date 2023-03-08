package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		System.out.println(map.size());
		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("D"));
		
		Set<Integer> keys = map.keySet();  // 키값을 빼내야 하는 이유 = 중복되지 않으니까!
		System.out.println(keys.toString());  // 어떤 키값이 들어갔는지 출력해보기
		
		for(int data:keys) {
			System.out.println(map.get(data));  // map에서 데이터를 하나씩 끄집어내는 역할
		}
	}

}
