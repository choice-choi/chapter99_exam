package org.joonzis.array;

import java.util.Arrays;

public class test02 {

	public static void main(String[] args) {
		// Q2. 배열 int[] answer={1,4,4,3,1,4,4,2,1,3,2}에서 	각 숫자의 갯수를 출력
//		* 숫자가 1~4까지 이므로 크기 4의 배열 counter를 만들어서 각 인덱스에 1~4의 개수를 입력 및 출력
		
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];	//크기 4의 배열 counter를 만들어서
		// 각 인덱스 순서에 1~4의 개수 입력
		
//		answer의 배열 다 돌리고 아래 값을 꺼내어 counter에 넣으면 됨
		
		System.out.println(Arrays.toString(counter));
		
		for(int i=0; i<answer.length; i++) {
			if(answer[i] == 1) {
				counter[0]++;
			}else if(answer[i] == 2) {
				counter[1]++;
			}else if(answer[i] == 3) {
				counter[2]++;
			}else if(answer[i] == 4) {
				counter[3]++;
			}
//			else {
//				
//			}
		}
		
//		System.out.println(Arrays.toString(counter));
		
		for(int i=0; i<counter.length; i++) {
			System.out.println((i+1) + "의 개수 => " + counter[i]);
		}
		
		
		
		
		
		

	}

}
