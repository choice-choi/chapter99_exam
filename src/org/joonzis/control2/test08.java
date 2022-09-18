package org.joonzis.control2;

public class test08 {

	public static void main(String[] args) {
		// Q8. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오
//		int[][] arr = {
//				{5, 5, 5, 5, 5},
//				{10, 10, 10, 10, 10},
//				{20, 20, 20, 20, 20},
//				{30, 30, 30, 30, 30}
//				};


		
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
				};
		
		int total = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
//				System.out.println(arr[i][j]+" ");
				total += arr[i][j];
			}
			System.out.println(total);
		}

		
		
		
		
		/*
		// Q8-1. 배열 arr에 담긴 모든 값 중 3의 배수를 더하는 프로그램을 완성하시오
		
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
				};
		
		int total = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%3==0) {
					total += arr[i][j];
				}
			}
			System.out.println();
		} 
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int[] arr1 = {5, 5, 5, 5, 5};
		int[] arr2 = {10, 10, 10, 10, 10};
		int[] arr3 = {20, 20, 20, 20, 20};
		int[] arr4 = {30, 30, 30, 30, 30};
		
		//int total = (arr1[i]+arr2[j]);
		
		
		int sum1 = 0;
		for(int i=0; i<arr1.length; i++) {
			sum1 = arr1[i];
			sum1 += arr1[i];
			System.out.println(sum1);
		}
		
		int sum2 = 0;
		for(int j=0; j<arr2.length; j++) {
			sum2 = arr2[j];
			sum2 += arr2[j];
			System.out.println(sum2);
		}

		
		System.out.println("총합 : " +total);
		

		
		
		
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
				};
		
		System.out.println("첫 번째 배열 길이" + arr.length);
		System.out.println("두 번째 배열 길이" + arr.length);
		System.out.println("세 번째 배열 길이" + arr.length);
		System.out.println("네 번째 배열 길이" + arr.length);
		
		System.out.println("arr[0][1][2][3]: " + arr[0][1][2][3]);

		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("배열 모든 값 : " + sum);
		*/
			
			
		
		
		
		
		
		
	}

}
