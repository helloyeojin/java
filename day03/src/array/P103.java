package array;

public class P103 {

	public static void main(String[] args) {
		
//		int arr[] = new int[3];   // int []arr = new int[3]; 이렇게도 쓸 수 있음 
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
		int arr[] = {10, 20, 30};   //같은 타입의 자료형만 들어갈 수 있음 
		System.out.println(arr);
		
		for(int i = 0; i< arr.length ; i++) {
			System.out.printf("%d \t", arr[i]);  // 배열의 위치값을 알려면 이렇게 출력해야함 
		}
		
		System.out.println("Type 2");
		for(int data:arr) {   //안에 들어가있는 데이터 타입:집합
			System.out.printf("%d \t", data);  // 화면에 출력할 때는 이 방법으로 사용 가
		}
	}

}
