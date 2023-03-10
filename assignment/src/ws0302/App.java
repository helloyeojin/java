package ws0302;

public class App {

	public static void main(String[] args) {
		Account acc[] = new Account[6];
		acc[0] = new Account("james1", 10000, 0.35, "VIP");
		acc[1] = new Account("james2", 10000, 0.45, "GOLD");
		acc[2] = new Account("james3", 10000, 0.55, "SIVER");
		acc[3] = new Account("james4", 10000, 0.15, "GOLD");
		acc[4] = new Account("james5", 10000, 0.28, "SIVER");
		acc[5] = new Account("james6", 10000, 0.31, "VIP");
		
		double sum = 0.0;
		double avg = 0.0;
		int cnt = 0;
		
		for (Account a:acc) {
			System.out.println(a);
		}
		System.out.println("");
		
		for (Account a:acc) {
			System.out.printf("%s님의 잔액은 %4.2f원이고, 현재 이자금액은 %4.2f입니다. \n", a.getAccName(), a.getBalance(), a.getInterest());
			if(a.getGrade().equals("VIP")) {
				sum += a.getBalance();
				cnt++;
			}
		}
		avg = sum / cnt;
		System.out.println("");
		System.out.printf("VIP 등급의 잔액의 합은 %4.2f원이고, 잔액의 평균은 %4.2f원입니다.", sum, avg);

	}

}
