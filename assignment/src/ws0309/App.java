package ws0309;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();  //Lotto 클래스 호출 
		
		ArrayList<Integer> myNum = new ArrayList<>();  //내가 입력한 숫자들의 리스트 myNum 생성 
		Scanner sc = new Scanner(System.in);
		int cnt = 1;
		
		while(myNum.size() < 3) {   //myNum 내부 값들의 개수가 3개가 될 때까지 반복 
			System.out.println("1~25 사이의 숫자를 세 개 입력해주세요! (" + cnt + "번째 숫자)");
			int n = Integer.parseInt(sc.next());
			if (n<1 || n>25) {
				System.out.println("잘못 입력하셨습니다. 1~25 사이의 숫자만 가능합니다.");  //1~25 범위 이내의 난수만 추가 
			} if (myNum.contains(n)) {
				System.out.println("중복된 숫자입니다. 다시 입력해주세요.");  //중복 제거
			} if (n>=1 && n<=25 && !myNum.contains(n)){
				myNum.add(n);
				cnt++;
			}
		}
		
		int rank = lotto.checkRanking(myNum);  
		double prizeMoney = Math.floor(lotto.prizeMoney(myNum));  
		//각 등수별로 정해진 퍼센테이지에 따라 당첨금을 나눠가졌을 때 소수점 아래 값이 나오는 경우 -> 소수점 아래 버림 
		DecimalFormat df = new DecimalFormat("#.0");
		//총 당첨금 값이 1.468092232E9 이런 식으로 반환되어서 decimal format으로 변경 
		String totalMoney = df.format(lotto.getPrizeMoney());
		String yourMoney = df.format(prizeMoney);
		
		System.out.println("\n\n당첨번호 = "+lotto.getWinningNum());
		System.out.printf("입력한 숫자 = %s\n\n", myNum);
		//printf의 argument로 ArrayList를 사용하면 자동으로 ArrayList의 toString 메소드를 호출 
		//-> ArrayList 내부의 Integer object를 문자형으로 변환하여 반환함 -> %s를 사용해야 myNum 내부의 값을 출력할 수 있음!
		if (rank < 4) {
			System.out.printf("ଘ(੭ˊᵕˋ)੭* ੈ✩‧₊˚ 축하합니다! %d등에 당첨되셨습니다!!!\n수령하실 당첨금은 총 당첨금 %s원 중 %s원입니다! *・°☆ ｡+.｡☆ﾟ｡+ﾟ_(′▽`*)β))", rank, totalMoney, yourMoney);
		} if (rank == 4) {
			System.out.printf("｡° ૮₍°´ᯅ`°₎ა °｡ 안타깝지만 %d등입니다... 수령 가능한 당첨금이 없습니다ㅠㅠ\n다음에는 꼭 당첨될 수 있을 거에요! (ू˃̣̣̣̣̣̣︿˂̣̣̣̣̣̣ ू)", rank);
		}
		
		sc.close();
	}
}
