package org.joonzis.control2.test;

public class Test10 {
	public static void main(String[] args) {
		
//		Q10. 피보나치 수열 20개를 출력 (배열 이용)
//		ex) 1, 1, 2, 3, 5, 8, 13, 21, ...
		
		int[] fibo = new int[20];	//배열을 이 식으로 지정함
		fibo[0] = 1;
		fibo[1] = 1;
		//위 과정으로 초기화 끝남
		
		// 위에서 인덱스 0,1 끝났으니 for문에서 i는 2부터 시작
		// fibo.length 끝나는 지점이지 횟수가 아님. fibo.length는 20임
		for(int i=2; i<fibo.length; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];	//인덱스 기준으로 1 1 2 는 2에서 첫1은 인덱스 -2 전, 두번째1은 인덱스 -1 전
		}
		
		String result = "";
		
		for(int i : fibo) {
			result += i + ", ";
			//System.out.print(i + ", ");
		}
		result = result.substring(0, result.length()-2); // 마지막 에서 ", " <- 2글자 제외
		System.out.println(result);
		
//		답 구하는 방법 2가지
//		array 인덱스 클래스를 이용하는 방법
//		for을 통해 하나하나씩 꺼내는 방법
		
		/*
		Q. 피보나치 수열 20개를 출력, for문 이용하여 아래처럼 나오게 해보기
		ex) 1, 1, 2, 3, 5, 8, 13, 21, ... 6765
		//문자열에서 문자 자르는 메소드 사용
		
		
		String str = "";	//출력하기 위한 for문 사용할 것
		
		for(int i : fibo) {
			str += i + ", ";
		}
		
		str = str.substring(0, str.length()-2); //일반 배열에선 필드로 썼는데 여기선 str.length()라는 메소드 // 마지막에서 ", " 제외
		// substring은 잘라서 어디부터 어디까지 출력하겠다
		
		System.out.println(str); 	//여기까지 하면 문자열 나옴
		
		*/
		
		
//		System.out.println(str1.substring(1));		// 지정한 index 부터 모든 문자열을 반환
//		System.out.println(str1.substring(1,3));	// 지정한 첫 번째 index 부터 두 번째 index 직전 까지의 문자열을 반환


		
		
	}
}
