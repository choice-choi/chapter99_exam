package org.joonzis.control2.test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
//		Q4. 총 4개의 과목 성적을 입력하여 평균이 60점 미만이면 과락, 60점 이상이면 합격을 출력
//		* 배열을 이용
		
		Scanner sc = new Scanner(System.in);
		//sc는 변수명이라 변경되어도 상관없음, 그냥 명칭임
		
		int[] subjectArr = new int[4];	//4개짜리 배열 만드는 것, 점수니까 int임, String 안됨 // 이 식까지 하고 for문 작성
		
		int sum = 0;
		double avg = 0;	//double avg = (double)sum/subjectArr.length; 아래 이 식 사용할거면 없어도 되는 식
		
		for(int i=0; i<subjectArr.length; i++) {
			System.out.print((i+1) + "번째 과목 성적을 입력해주세요. >> ");
			subjectArr[i] = sc.nextInt();	//배열의 모든 값 입력받는 증가 인덱스 사용
			sum += subjectArr[i];	//총점 구하는 for문 따로 써도 되나 그냥 미리 구해도 됨
		}
		
		avg = (double)sum / subjectArr.length;
		//double avg = (double)sum/subjectArr.length; >>위 식과 같음
		
		if(avg <= 60) {
			System.out.println("과락");
		}
		else {
			System.out.println("합격");
		}
	}

}
