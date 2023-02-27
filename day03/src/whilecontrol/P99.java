package whilecontrol;

public class P99 {
	
	public static void main(String[] args) {
		
		myfor: //레이블 
		for(int i=2;i<10;i++) {
			System.out.printf("%d 단 \n",i);
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d \t",i,j,(i*j));
				if((i*j) == 21) {
					break myfor;
				}
			}
			System.out.println("");
		}
	}
}