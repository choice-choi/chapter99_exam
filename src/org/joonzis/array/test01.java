package org.joonzis.array;

import java.util.Arrays;

public class test01 {

	public static void main(String[] args) {
		// Q1. 배열의 크기가 10인 배열을 선언하고 
//		1~10까지 순서대로 값을 넣은 후 
//		배열과 배열의 값의 합을 출력
		
//		*배열출력
		int[] arr1 = new int[10];
		
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (i+1);
		}
		
		//잘 들어왔는지 데이터 값 확인!(값 입력)후 주석 처리하기 >> 배열은 특정 주소 값이 필요
		System.out.println(Arrays.toString(arr1));
		
//		*배열 내의 있는 값
		int total = 0;
		for(int i=0; i<arr1.length; i++) {
//			System.out.println(arr1[i]);
			total += arr1[i]; 
		}
		
		System.out.println("총합 : " + total);
		
		
		
		
		
		/*
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = 0;
		
		
		for(int i=0; i<arr2.length; i++) {
			sum += arr2[i];
			System.out.println("배열 : " + arr2);
			System.out.println("배열 값의 합 : " + sum);
		}
		*/
		
		
		
		

	}

}
