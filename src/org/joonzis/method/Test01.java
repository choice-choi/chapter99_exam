package org.joonzis.method;
/*
 * Q1. main 함수에서 반지름을 받은 후 
	원의 넓이를 구하는 메소드 circleArea와 원의 둘레를 구하는 메소드 circleRound를 만드시오.
	* circleArea 메소드는 함수 안에서 출력문을 출력하고
	circircleRound 메소드는 원의 둘레를 리턴받아서 main함수에 출력
	(원의 넓이 구하는 공식 : 3.14 * 반지름 * 반지름, 원의 둘레 구하는 공식 : 2 * 3.14 * 반지름)
 */
public class Test01 {

	/*
	나의 답안
	double r;
	// 원의 넓이를 구하는 메소드
	void circleArea(double r) {
		this.r = r;
		System.out.println("원의 넓이 : " + 3.14 * r * r);
	}
	
	
	// 원의 둘레를 구하는 메소드
	
	double circleRound() {
		return (2 * 3.14 * r);
	}
	
	void output() {
//		System.out.println(2 * 3.14 * r);
		System.out.println("원의 둘레 : " + circleRound());
	}
	
	
	
	public static void main(String[] args) {
	
		Test01 ca1 = new Test01();
		ca1.circleArea(1.5);
		ca1.circleRound();
		ca1.output();

	}
	*/
	
	// 함수 안에서 데이터 출력 = 리턴이 필요 없음
	static void circleArea(double r) {
		// 원의 넓이 PI * r * r
		System.out.println("원의 넓이 : " + (Math.PI * r * r));
	}
	
	// 계산만 하고 끝내는 식
	static double circleRound(double r) {
		// 원의 둘레 2 * PI * r
		return (2 * Math.PI * r);
	}
	
	public static void main(String[] args) {	// 위 두 식에 static 붙여야 함
		circleArea(1.5);
		System.out.println("원의 둘레 : " + circleRound(1.5));
	}
	
	
	
	
	
	
	

}
