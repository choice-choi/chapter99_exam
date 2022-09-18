package org.joonzis.control2;

public class test10 {

	public static void main(String[] args) {
		// Q10. 피보나치 수열 20개를 출력(배열 이용)
//		ex) 1, 1, 2, 3, 5, 8, 13, 21, ...
		
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {1,2,3,4,5,6};
		
//		1+5
//		2+4
//		3+3
//		4+2
//		5+1
		
		int sum = 0;
			
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr2.length; j++) {
				
				if(arr1[i] + arr2[j] == 6) {
					System.out.println(arr1[i] + "/" + arr2[j]);
				}
				
			}
			
		}
		
		
		
		int[] num1 = new int[20];
		
		for(int i=0; i<arr1.length; i++) {
			
			
			
		}
				
		
		
		
		
	}

}
