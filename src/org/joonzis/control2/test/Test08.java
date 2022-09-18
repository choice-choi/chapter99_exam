package org.joonzis.control2.test;

public class Test08 {
	public static void main(String[] args) {
		
//		Q8. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오
//		int[][] arr = {
//				{5, 5, 5, 5, 5},
//				{10, 10, 10, 10, 10},
//				{20, 20, 20, 20, 20},
//				{30, 30, 30, 30, 30}
//				};
		// **챕터05 2D array에 있는 식 복붙하면 됨 
		
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
				};
		
		int ans = 0;
		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
			//위에 arr[i]빼먹지 않도록 조심, arr.length은 4번 도는 거고 arr[i].length는 5번 도는 것
//				System.out.print(arr[i][j]+"");	//접근 잘 하고있는지 찍어보는 식	
				ans += arr[i][j];
			}
//			System.out.println();	//접근 잘 하고있는지 찍어보는 식	
		}
			System.out.println("배열 arr의 총 합은 : " + ans);
		
	}
}
