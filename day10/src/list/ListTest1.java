package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); //제너릭으로 쓸 때는 primitive type으로 쓸 수 없어요 
		// 1~10까지의 숫자를 랜덤하게 10개 담으세요
		
		Random r = new Random();
		for(int i=0; i<10; i++) {
			int num = r.nextInt(10) + 1;
			list.add(num);
		}
		list.add(0, 100);	
//		list.add(10);  
		//이런 경우 특별히 primitive type의 숫자를 Integer라는 객체 타입에 넣을 수 있게 허용해줌 = integer랑 double만! 
//		list.add(20);
//		list.add(30);
		for(int data:list) {  //auto-boxing
			System.out.println(data);
		}
	}

}
