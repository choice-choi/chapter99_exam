package org.joonzis.class03;

//import org.joonzis.class02.DataClass;

/*
3) MainClass
(1) OperClass를 이용한 메소드 실행
*/
public class MainClass {

	public static void main(String[] args) {


		OperClass oc = new OperClass();
		DataClass dc = new DataClass();
		
		oc.avgHireDate(dc.ic);
		oc.search(dc.ic, "2007");
		
//		객체생성은 메인에서 이뤄진다
//		인포클래스라는 데이터 타입의 배열을 받는다
//		데이터클래스에 인포클래스라는 필드 있음
//		메인에서 오퍼클래스로 ic 던져줌
		
			

		
		
		
				
	}

}
