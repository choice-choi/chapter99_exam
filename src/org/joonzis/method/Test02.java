package org.joonzis.method;

public class Test02 {

	static boolean isPrimeNumber(int num) {
		// 소수일 때 true 리턴
		// 소수가 아니면 false 리턴
		// 무조건 boolean 값이 return 되어야 함
		
		if(num == 1) {
			//1은 소수가 아니므로 무조건 false 반환
			return false;
		}else {
			for(int i=2; i<num; i++) {		// 소수 판단하려면 1을 제외한 나머지 숫자로 나눴을 때 나눠 떨어지냐로 판단 > 나눠 떨어지면 소수가 아님
				// 1과 자기 자신을 제외한 숫자로 나눠서 떨어지면 소수가 아니므로
				// 그 이후는 검사할 필요가 없다.
				// 판단되는 즉시 false를 반환하고 종료한다.
				if(num % i == 0) {
					return false;	//어떤 메소드든 return코드 뒤에 연산하면 실행 안 됨
				}
			}
			return true;
		}
	}
		
	public static void main(String[] args) {
		
		for(int i=1; i<101; i++) {
			if(isPrimeNumber(i)) {
//				System.out.println(isPrimeNumber());
				System.out.println(i);
			}
		}
		
		
	}

}
