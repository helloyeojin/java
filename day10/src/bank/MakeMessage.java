package bank;

public class MakeMessage {
	public static String makeMessage(String code) {
		String result = "";
		switch(code) {
		case "ER01": result = "계좌개설 실패_입력금액 오류"; break;
		case "ER02": result = "입력금액 오류"; break;
		case "ER03": result = "잔액 부족"; break;
		default: result = "고객센터에 문의 바랍니다.";
		}
		return result;
	}
}
