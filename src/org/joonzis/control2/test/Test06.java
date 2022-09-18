package org.joonzis.control2.test;

public class Test06 {
	public static void main(String[] args) {
		
//		Q6. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
//		>> 경우의 수 출력
//		>> 경우의 수
//			1/5
//			2/4
//			3/3
//			4/2
//			5/1
//		>> 배열 사용해도 되나 복잡하여 for문 사용함
		
		
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				if(i+j==6) {
				//i+j==6 -> 경우의 수인 상황을 뜻하는 식
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
		
		/*
		배열 사용한 답안)
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {1,2,3,4,5,6};
				
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr2.length; j++) {
				
				if(arr1[i] + arr2[j] == 6) {
					System.out.println(arr1[i] + "/" + arr2[j]);	//인덱스 번호로 비교하고 있기 때문에 해당 식으로!
				}
			
			}
			
		}
		 */
		
		
		
		
		
		
		
		
	}
}
