package org.joonzis.control1;

//import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		// Q5. 1부터 100까지 수 중에 3의 배수이거나 7의 배수인 수의 합을 출력
//		* 3과 7의 공배수는 계산에서 제외
//		>> 값의 범위가 나오면 거의 반복문 
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("1~100 입력 >> ");
//		int num = sc.nextInt();
//		
//		String sum = (num % 3 == 0 || num % 7 == 0) ? "3의 배수" : "7의 배수";
//		
//		System.out.println("합계 : " + sum);
//		
//		sc.close();
		
//		1) 1이 3의 배수 or 7의 배수
//		2) 2//
		
		
		//for문 사용
		
		//공배수 사용
//		i%(3*7)==0
		
	
		System.out.println("1~100 입력 >> ");
		
		int sum = 0;
				
		for(int i=1; i<=100; i++) {
			if(i%3==0 || i%7==0) {
				
				if( !(i%(3*7)==0) ) {
//					System.out.println(i);
					sum += i;
				}
			
			}
		}
			System.out.println("총 점 : " + sum);
		
		
				/*
				답2)

				int start = 1;
				int end = 100;
				int sum = 0;
						
				for(int i=start; i<=100; i++) {
					if(i%3==0 || i%7==0) {
						System.out.println(i);	//여기까지 해서 찍어보고 값이 맞은 것 같으면 계속 진행
						sum += i;
						
						// 아래 if랑 같음 >> if(i%(3*7)!=0)
						if( !(i%(3*7)==0) ) {
		
						}
					
					}
				}
			// 평균은 for문 밖에서 값 찍기
				*/
		
		

		
		
		
		
		
	}

}
