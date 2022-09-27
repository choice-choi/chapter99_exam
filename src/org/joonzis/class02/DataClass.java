package org.joonzis.class02;

public class DataClass {	// 데이터 타입이 인포클래스임 
	InfoClass[] ic = new InfoClass[6];	// 참조 배열과 비슷하게 접근할 예정 / 호출 가능한 정보를 갖는 식
	
	public DataClass() {	// 생성자이기 때문에 호출하는 용도가 아님
		ic[0] = new InfoClass("이것이 자바다", 30000, "신용권", "한빛미디어");	// ic[0] 자체가 인포클래스임 
		ic[1] = new InfoClass("파이썬", 25000, "홍길동", "길벗");
		ic[2] = new InfoClass("정보처리기사", 35000, "기사", "길벗");
		ic[3] = new InfoClass("HTML", 15000, "꾸미기", "한빛미디어");
		ic[4] = new InfoClass("JSP&Servlet", 23000, "열혈", "길벗출판사");
		ic[5] = new InfoClass("오라클", 21000, "oracle", "A길벗 출판사");
	}
	
}
