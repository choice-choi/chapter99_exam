package org.joonzis.control1;

public class test02 {

	public static void main(String[] args) {
		// Q2. 국어 99점, 영어 80점, 수학 96점의 평균 값을 실수형과 정수형으로 출력

//		답1)
//		int[] arr = {99, 80, 96};
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		
//		int avg1 = sum/arr.length;
//		double avg2 = (double)sum/arr.length;
//
//		
//		System.out.println("정수형 평균 : " + avg1);
//		System.out.println("실수형 평균 : " + avg2);
		
		
		
//		답2)
		int k = 99;
		int e = 80;
		int m = 96;
		
		int sum = (k+e+m);
		
		int avg1 = sum/3;
		double avg2 = sum/3.0;	// 3으로 나누는 것과 3.0으로 나누는 결과가 달라진다.

		
		System.out.println("정수형 평균 : " + avg1);
		System.out.println("실수형 평균 : " + avg2);
		
	}

}
