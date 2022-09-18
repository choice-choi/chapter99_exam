package org.joonzis.control2.test;

public class Test02 {
	
	public static void main(String[] args) {
		//	Q2. 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오
//		>> 1부터 20까지의 정수 중에서 >> for문 사용
//		*논리식임		
		
		int ans=0;
		
		for(int i=1; i<=20; i++ ) {
			if(i % 2!=0 && i % 3 !=0) {
//				System.out.println(i);	// 값 나오는지 찍어보는 과정
				ans += i;
			}
		}
		System.out.println("2 또는 3의 배수가 아닌 수의 총합 : " + ans);
	}

}
