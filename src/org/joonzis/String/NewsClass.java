package org.joonzis.String;
/*
 * Q. 주어진 데이터 내의 
	"HTML5"과 "하이브리드앱"라는 단어가 몇번 노출되는 지
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
public class NewsClass {
	String news;
	
	public NewsClass(String news) {
		this.news = news;
	}

}
