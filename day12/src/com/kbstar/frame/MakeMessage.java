package com.kbstar.frame;

public class MakeMessage {
	public static String makeMessage(String code) {
		String result = "";
		switch(code) {
		case "ER01": result = "계좌개설 실패_입력금액 오류"; break;
		case "ER02": result = "입력금액 오류"; break;
		case "ER03": result = "잔액 부족"; break;
		case "ER04": result = "이미 존재하는 아이디입니다."; break;
		case "ItemER01": result = "이미 존재하는 번호입니다."; break;
		case "ItemER02": result = "존재하지 않는 상품번호입니다."; break;
		default: result = "고객센터에 문의 바랍니다.";
		}
		return result;
	}
}
