package org.joonzis.control2.test;

public class Test09 {
	public static void main(String[] args) {
//		Q9. 배열 int[] arr = {1,2,3,5,6} 의 값 중에 최대 값, 전체 합, 평균 값 출력하기
		
		int[] arr = {1,2,3,5,6};
		
		int max = arr[0];	//얘는 초기화 0말고 비교할 배열의 값으로 하기
		int sum = 0; 		//항상 얘는 습관적으로 초기화하기
		double avg = 0;		//항상 얘는 습관적으로 초기화하기
		
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			sum += arr[i];	//조건이랑 상관없이 sum값 구하는 중
		}
		avg = (double)sum/arr.length;
		
		System.out.println("최대 값 : " + max);
		System.out.println("전체 합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
