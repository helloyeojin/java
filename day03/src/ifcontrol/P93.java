package ifcontrol;

import java.util.Scanner;

public class P93 {

	public static void main(String[] args) {
		// 4개의 두 자릿수를 입력받는다.
		// 만약 2자릿수가 아니면 프로그램 종료 
		Scanner sc = new Scanner(System.in);
		int ko = 0;
		int en = 0;
		int ma = 0;
		int si = 0;
		
		int sum = 0;
		double avg = 0;
		// avg = sum / 4라고 해버리면 정수형 반환 -> avg = sum / 4.0으로 하면 맞는 결과 출
		
		String grade = "";
		
		System.out.println("국어성적 입력:");
		ko = Integer.parseInt(sc.next());
		if ((ko/10)<1 || (ko/10)>9) {
			System.out.println("잘못된 숫자를 입력하셨습니다. (2자리수만 가능) 프로그램을 종료합니다.");
			sc.close();
			return;
		}
		
		System.out.println("영어성적 입력:");
		en = Integer.parseInt(sc.next());
		if ((en/10)<1 || (en/10)>9) {
			System.out.println("잘못된 숫자를 입력하셨습니다. (2자리수만 가능) 프로그램을 종료합니다.");
			sc.close();
			return;
		}
		
		System.out.println("수학성적 입력:");
		ma = Integer.parseInt(sc.next());
		if ((ma/10)<1 || (ma/10)>9) {
			System.out.println("잘못된 숫자를 입력하셨습니다. (2자리수만 가능) 프로그램을 종료합니다.");
			sc.close();
			return;
		}
		
		System.out.println("과학성적 입력:");
		si = Integer.parseInt(sc.next());
		if ((si/10)<1 || (si/10)>9) {
			System.out.println("잘못된 숫자를 입력하셨습니다. (2자리수만 가능) 프로그램을 종료합니다.");
			sc.close();
			return;
		}

		
		// 평균과 합계를 구한다. 
		
		sum = (ko + en + ma + si);
		avg = sum / 4.0;
		
		// 평균이 90 이상이면 A
		// 평균이 80 이상이면 B
		// 평균이 70 이상이면 C
		// 평균이 60 이상이면 D
		// 60 미만이면 F

		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		grade = (avg >= 90) ? "A" : (avg >= 80) ? "B" : (avg >= 70) ? "C" : (avg >= 60) ? "D" : "F";
		
		// 합계, 평균, 학점을 출력하시오 
		System.out.printf("합계 : %d, 평균 : %4.2f, 학점 : %s", sum, avg, grade);
		sc.close();
	}

}
