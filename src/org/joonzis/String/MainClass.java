package org.joonzis.String;

import java.util.Arrays;

/*
 * Q. 주어진 데이터 내의 
	"HTML5"과 "하이브리드앱"라는 단어가 몇번 노출되는 지	>>동일X 포함O!
	노출 횟수를 resultNum이라는 배열명으로 저장하여 출력

1) NewsClass
	필드 : String news
	메소드 : 생성자
2) DataClass
	ArrayList<> 를 이용하여 NewsClass에 값 전달
3) MainClass
	데이터를 받아서 데이터 처리
	
+OperClass를 추가하여 처리부분 가능
 */
public class MainClass {
	public static void main(String[] args) {
		
		DataClass dc = new DataClass();
		
		String con = dc.newsList.get(0).news;
		// String 메소드임
		// 인덱스 번호에 있는걸 갖고 오는 것
		// 동적 배열은 get에서 인덱스 번호 호출하는 것
		
		String keyword1 = "HTML5";
		// 위 문자열을 " " 공백으로 잘라 split 메소드로 배열화 시킨 후
		// 배열 내 문자열을 비교하여 결과 출력
		String keyword2 = "하이브리드앱";
		
		String[] split = con.split(" ");
		
//		System.out.println(Arrays.toString(split));
//		System.out.println(split.length);
//		>> 위 식들로 잘 출력되고 있는지 중간 체크!
		
		int resultNum[] = new int[2];
//		resultNum[0];	>> HTML5의 노출 횟수
//		resultNum[1];	>> 하이브리드앱의 노출 횟수

		for(int i=0; i<split.length; i++) {
			 if(keyword1.contains(split[i])) {
				 resultNum[0]++;
			 }
			 if(keyword2.contains(split[i])) {
				 resultNum[1]++;
			 }
		}
		
		System.out.println(Arrays.toString(split));
		System.out.println(split.length);
		
		
//		String str3 = "Ja-va";
//		String[] s = str3.split("-");		// 지정한 문자로 분리하여 배열로 반환
//		System.out.println(s.length);
		
		
	}

}
