package org.joonzis.array;

public class test03 {

	public static void main(String[] args) {
		// Q3. 배열 int[][] arr={{1, 2, 3, 4}, {5, 6, 7}, {8, 9}} 에서 각 값을 2씩 증가시키는 프로그램 작성
//  ex) 1 2 3 4 
//	5 6 7 
//	8 9 
//	
//	3 4 5 6 
//	7 8 9 
//	10 11 
//* 배열을 전달 받아 데이터를 출력하는 메소드 = arrPrint
//* 배열과 증가할 값을 전달 받아 해당 값만큼 증가시키는 메소드 = addTwoArr
		
		//메소드 대신 코드로 녹이는 방법, 답안
		int[][] arr={{1, 2, 3, 4}, {5, 6, 7}, {8, 9}};
		
//		* 출력 for문
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
//				arr[i][j];	//전제 접근하려면 해당 식
			}
			System.out.println();	//for문이 끝나면 그 떄 엔터!
		}
		
//		*2씩 증가하는 for문
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] += 2;	//2를 더해주면 됨
			}
			System.out.println();	//for문이 끝나면 그 떄 엔터!
		}
		
//		* 다시 출력 for문
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
//				arr[i][j];	//전제 접근하려면 해당 식
			}
			System.out.println();	//for문이 끝나면 그 떄 엔터!
		}
		
		
		

	}

}
