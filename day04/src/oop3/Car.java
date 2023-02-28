package oop3;

public class Car {
	private String name; 
	private String color;
	private int size;
	private int fsize; //기름통사이즈 
	private int cfsize;  //현재 기름량 
	
	
	
	public Car() {
	}

	 
   public Car(String name, String color, int size, int fsize) {
	      this.name = name;
	      this.color = color;
	      this.size = size;
	      this.fsize = fsize;
	   }

	   public Car(String name, String color, int size, int fsize, int cfsize) {
	      this(name, color, size, fsize);
	      this.cfsize = cfsize;
	   }
 
	 @Override
		public String toString() {
			return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
					+ "]";			
	 }
	 
	 /* 기름을 넣는다.
	  * 기름통보다 많이 넣으면 - 다시 주유하세요
	  * 음수 값이 들어가면 - 다시 주유하세요 
	  */
   public void setCfsize(int size) {
	      if(size <= 0 || (cfsize + size) > fsize) {
	         System.out.println("다시 주유하세요");
	         return;
	      }
	         cfsize += size;  //여기 굳이 if else나 else를 쓸 필요가 없음! 그냥 흐름만 제어하면 되고.. 위에서 잘못되면 그냥 끝나니까 
	         System.out.printf("현재 기름량은 %d입니다.", cfsize);
	      }

	 
	 // 주행을 한다
	 // 1리터당 10킬로미터를 주헹할 수 있다
	 public void go(int distance) {
		 if(cfsize < 0 || (distance/10) > cfsize) {
			 System.out.println("주유하시고 출발하세요");
			 return;
		 }
		 System.out.printf("%s %d Go ... ", this.name, distance);
		 cfsize -= (distance/10);  // 근데 이렇게 되면 문제가 distance/10의 소수점이 출력이 안됨 
	 }
	 
	 //멈춘다.
	 public void stop() {
		 System.out.printf("%s Stop...", this.name);
	 }
}
