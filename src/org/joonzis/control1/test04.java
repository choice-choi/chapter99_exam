package org.joonzis.control1;

public class test04 {

	public static void main(String[] args) {
		// Q4. num이라는 변수에 120이라는 숫자를 초기화 한 후에 이 숫자가 
		//	양수인지, 음수인지, 짝수인지, 홀수인지 출력

		
		// 2. 다중 데이터 출력(묶음 나누기)
		int num = 120;
		
		if(num>0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}
		
		if (num%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
		
//		>>논리식 답2
//		if(num>0 && num%2==0) {
//			System.out.println("양수 & 짝수");
//		}else if(num>0 && num%2==1) {
//			System.out.println("양수 & 홀수");
//		}else if(num<0 && num%2==0) {
//			System.out.println("음수 & 짝수");
//		}else {
//			System.out.println("음수 & 홀수");
			
			
		
		
//		if(num>0 && num%2==0) {
//			System.out.println("양수, 짝수");
//		}else {
//			System.out.println("음수, 홀수");
//		}
		
		
		
		
//			// 1)
//			if(num % 2 == 0) {
//				System.out.println("짝수");
//			}else if (num % 2 == 1) {
//				System.out.println("홀수");
//			}else {
//				System.out.println("3의 배수");
//			}
//				
//		
//			// 2)
//			if(num % 3 == 0 && num % 2 == 0) {
//				System.out.println("3의 배수이면서 짝수");
//			}else if(num % 3 == 0 && num % 2 == 1) {
//				System.out.println("3의 배수이면서 홀수");
//			}else if(num % 3 == 0 && num % 2 == 0) {
//				System.out.println("짝수");
//			}else {
//				System.out.println("홀수");
//			}

		
		
		
	}

}
