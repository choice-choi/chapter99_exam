package org.joonzis.control2;

public class test06 {

	public static void main(String[] args) {
		// Q6. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
		
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {1,2,3,4,5,6};

//		i+arr1[i]=6;
		
//		1+5
//		2+4
//		3+3
//		4+2
//		5+1
		
		int sum = 0;
//		int i = 0;
		
		
		for(int i=0; i<arr1.length; i++) {
			
			for(int j=0; j<arr2.length; j++) {
				
				if(arr1[i] + arr2[j] == 6) {
					System.out.println(arr1[i] + "/" + arr2[j]);
				}
				
			}
			
		}
		
		
		
		
		/*
		for(int i=0; i<arr1.length; i++) {
			if(sum==6) {
				(i+1)*(arr1[i])==6;
				System.out.println(sum);	
			}
		}
		for(int j=0; j<arr2.length; j++) {
			if(sum==6) {
				(j+1)*+(arr2[j])==6;
				System.out.println(sum);	
			}
		}
		
		*/
		
		
		
		
	}

}
