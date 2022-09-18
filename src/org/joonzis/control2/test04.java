package org.joonzis.control2;

//import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		// Q4. 총 4개의 과목 성적을 입력하여 평균이 60점 미만이면 과락, 60점 이상이면 합격을 출력
//		* 배열을 이용
		
		
		int a = 50;
		int b = 60;
		int c = 70;
		int d = 80;
		
		int sum = (a+b+c+d);
		int avg = sum/4;
		
		if(avg<=60) {
			System.out.println("과락");
		}else {
			System.out.println("합격");
		}
		
		
		
		
//		int[] sub = {50, 70, 80, 90, 99};
//		int avg = sub[i];
//		
//		for(int i=0; i<=sub.length; i++) {
//			if(sub[i]<=60) {
//				System.out.println("과락");
//			}else {
//				System.out.println("합격");
//			}
//		}
		
		
		


		
	}

}
