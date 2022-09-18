package org.joonzis.control1.test;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
//		Q3 .사용자에게 값을 입력받은 후 그 값이 숫자인지 아닌지를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값 입력 >> ");
		int val = sc.nextInt();
		
		if(val >= 48 && val <=57) {
			System.out.println("숫자 입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
	
	}
}
