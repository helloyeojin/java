package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();  //인터페이스 개념 
		//new LikedList<Integer>();도 가능! 왜냐면 위에 코드를 인터페이스 사용방식으로 써놨기 때문에~ (LinkedList가 더 빠릅니다) 
		//인터페이스 안 쓸거면 ArrayList<Integer> list = new ArrayList<Integer>(); 이렇게 쓸 수도 있음...
		Random r = new Random();
		// new List<Integer>();는 안됨 = interface는 객체를 생성할 수 없기 때문에!
		
		// 1~10까지의 숫자를 20개 입력한다.
		// 단 while문을 이용한다.
		
//		int i=0;

//		while(i<20) {
//			list.add(r.nextInt(10)+1);
//			i++;
//		}
//		for (int data:list) {
//			System.out.println(data);
//		}
		
		while(list.size() < 20) {
			list.add(r.nextInt(10)+1);
		}
		for (int data:list) {
			System.out.println(data);
		}
	}

}
