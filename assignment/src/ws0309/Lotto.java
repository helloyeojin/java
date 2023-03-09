package ws0309;

import java.util.ArrayList;
import java.util.HashSet;

public class Lotto {
	private HashSet<Integer> winningNum;
	private double prizeMoney;
	public Lotto() {   // 당첨숫자, 총 당첨금 난수 생성하는 클래스 호출 
		this.winningNum = MakeWinningNumberMoney.makeWinningNum();
//		System.out.println(winningNum);
		this.prizeMoney = MakeWinningNumberMoney.makeWinningMoney();
//		System.out.println(prizeMoney);
	}
	
	public Lotto(HashSet<Integer> winningNum, double prizeMoney) {
		this();
	}

	public HashSet<Integer> getWinningNum() {
		return winningNum;
	}

	public void setWinningNum(HashSet<Integer> winningNum) {
		this.winningNum = winningNum;
	}

	public double getPrizeMoney() {
		return prizeMoney;
	}

	public void setPrizeMoney(double prizeMoney) {
		this.prizeMoney = prizeMoney;
	}

	@Override
	public String toString() {
		return "Lotto [winningNum=" + winningNum + ", prizeMoney=" + prizeMoney + "]";
	}
	
	public int checkRanking(ArrayList<Integer> myNum) {
		int rank = 0;
		int cnt = 0;
		ArrayList<Integer> winningNumList = new ArrayList<>(winningNum);  
		// HashSet winningNum을 ArrayList로 변환 
		
		for(int m:myNum) {   // 내가 입력한 숫자들의 리스트 myNum과 당첨 숫자 리스트 winningNumList 비교 
			for (int n:winningNumList) {
				if (m == n) {
					cnt++;
				}
			}
		}
		rank = 4 - cnt;
		// myNum 내 값과 winningNumList 내의 값이 가장 많이 일치하는 경우(=1등) cnt는 3이 됨
		// 4-cnt를 해서 등수를 도출(1~4등)
		return rank;
	}
	
	public double prizeMoney(ArrayList<Integer> myNum) {
		int rank = checkRanking(myNum);
		double result = 0.0;
		
		switch(rank) {
			case 1: {
				result = prizeMoney * 0.5;
				break;
			}
			case 2: {
				result = prizeMoney * 0.3;
				break;
			}
			case 3: {
				result = prizeMoney * 0.2;
				break;
			}
			default: {
				result = 0.0;
				break;
			}
		}
		return result;
		
	}
}


 