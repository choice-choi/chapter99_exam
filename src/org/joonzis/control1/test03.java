package org.joonzis.control1;

//import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		// Q3 .사용자에게 값을 입력받은 후 그 값이 숫자인지 아닌지를 출력
		// * 아스키 코드표 참고
		// >> 숫자인지를 물었으니 int로 하면 best!
		
//		Scanner sc = new Scanner(System.in);	//스캐너 없어도 되긴 함 스캐너쓰려면 아래 charAt 메소드 사용해야 함
		
		char ch = '5';
//		char ch = sc.next();.charAt(0);
		
		if(ch >= '0' && ch <= '9') {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}

		//String은 Char배열에 있는 애들과 똑같다.
		//sc.next();.charAt(0); >> 캐릭터에서 0번째 글자를 뽑아오겠다 >> 해당 문자열 중에 몇 번째 배열에 있는 걸 뽑아온다는 메소드 지칭
		
		
		
		
		
//		Test05.java
////		Q. 문자를 하나 입력 받아 "대문자", "소문자", "아라비아 숫자", "일반 문자" 구분해서 출력하기
////		     아스키 코드표 참고
//		
//		char ch = '8';
//		
//		if(ch >= 'A' && ch <='Z') {
//			System.out.println( "대문자");
//		}else if(ch >= 'a' && ch <= 'Z') {
//			System.out.println("소문자");
//		}else if(ch >= '0' && ch <= '9') {
//			System.out.println("숫자");
//		}else {
//			System.out.println("일반 문자");
//		}
		
//		char ch1 = 'A';
//		char ch2 = '한';
		
		//int 형일 때 ASCII Code 값 반환
		//int ch_1 = 'A';		
		//int ch_2 = '한';
		//System.out.println(ch_1);
		//System.out.println(ch_2);
//		
//		System.out.println(ch1 + ch2); 	// 코드값을 더한 것 , 캐릭터는 +로 연결하면 숫자로 값이 나온다. 
//		System.out.println(""+100+100);	// 앞에 문자열을 붙여주면 전체 문자로 표시된다.
//		System.out.println(ch1);
//		System.out.println(ch2);
		
		/*
		 * 4. 논리형
		 * 	1) boolean
		 * 		(1) 참 	: true
		 * 		(2) 거짓	: false
		 *		(3) 관계 연산자, 논리 연산자의 결과 
		 */
//		boolean isPositive;
//		isPositive = true;
//		if(isPositive) {
//			System.out.println("양수이다!");
//		}
		
		
	}

}
