package ws0309;

import java.util.HashSet;
import java.util.Random;

public class MakeWinningNumberMoney {
	public static HashSet<Integer> makeWinningNum() {  //당첨숫자 3개 난수 생성 
		HashSet<Integer> winningNum = new HashSet<Integer>();
		Random r = new Random();
		while (winningNum.size()<3) {  //세트 내에 있는 값들의 총 개수가 3개가 될 때까지 반복(HashSet은 중복 허용X)
			winningNum.add(r.nextInt(25)+1);
		}
		return winningNum;
	}
	public static double makeWinningMoney() {
		double prizeMoney = 0.0;
		Random r = new Random();
		prizeMoney = r.nextInt(2000000000)+1;  //1~2000000000 사이의 난수 생성
		return prizeMoney;
	}
}
