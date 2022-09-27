package org.joonzis.class02;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		// DataClass 내용 필요함 -> ic 배열 내용(InfoClass)
		// InfoClass에는 4개의 필드가 있음 (책 제목, 가격, 저자, 출판사)
		// 메인에서 출판사를 알고싶으면 DataClass.ic[0].class
		
		DataClass dc = new DataClass();	//데이터클래스 사용하기 위해 객체 생성하는 식 >> 데이터클래스 안에 있는 배열을 이용할 예정
		
//		ic[0]은 InfoClass 그 자체, 해당 클래스에 자료가 있음
//		System.out.println(dc.ic[0].press);	>> InfoClass를 담고 있는 참조 배열
		
		// 1. 전체 책의 값의 합 출력
		int sum = 0;	// 값을 더할 하나의 변수 생성
		for(int i=0; i<dc.ic.length; i++ ) {	// 배열의 길이만큼
			sum += dc.ic[i].price;	// 인포클래스의 해당하는 필드 값이 데이터클래스 안에 들어가져있으니 데이터클래스 안에있는 ic[]에 있는 하나의 필드값 뽑아오는 식
		}
		System.out.println("전체 책 값 : " + sum);
		// 2. 전체 도서 정보 중 출판사가 '길벗'인 책 제목 출력
		for(int i=0; i<dc.ic.length; i++ ) {		// 전체 도서 정보 중
			if((dc.ic[i].press.equals("길벗"))) {		//출판사가 길벗인
				System.out.println("'길벗'인 책 제목 : " + dc.ic[i].title);	//책 제목 출력
			}
	}	
		
		// 3. 전체 도서 정보 중 출판사가 '길벗'을 포함하는 경우의 책 제목 출력
		for(int i=0; i<dc.ic.length; i++ ) {		// 전체 도서 정보 중
			if((dc.ic[i].press.contains("길벗"))) {	//출판사가 길벗을 포함하는
				System.out.println("'길벗'을 포함하는 책 제목 : " + dc.ic[i].title);	//책 제목 출력
			}
	}	
		
		/*
		답2)
		DataClass dc = new DataClass();
		
		String sum1 = " ";
		String sum2 = " ";
		
		int sum = 0;	// 값을 더할 하나의 변수 생성
		for(int i=0; i<dc.ic.length; i++ ) {	// 배열의 길이만큼
			sum += dc.ic[i].price;	// 인포클래스의 해당하는 필드 값이 데이터클래스 안에 들어가져있으니 데이터클래스 안에있는 ic[]에 있는 하나의 필드값 뽑아오는 식
		}
		
		
		for(int i=0; i<dc.ic.length; i++ ) {	// 전체 도서 정보 중
			if((dc.ic[i].press.equals("길벗"))) {	//출판사가 길벗인
				sum2 += dc.ic[i].title +" ";	//책 제목 출력
			}
			if((dc.ic[i].press.contains("길벗"))) {
				sum1 += dc.ic[i].title +" ";
			}
			
			System.out.println(sum1);
			System.out.println(sum2);
	}	
		 */
		
		
		
		
		
		
		/*
		System.out.println(sum2);
		String str = sum2;
		if(str.endsWith(",")) {
			str = str.substring(0, str.length()-1);
		}
		System.out.println(str);
		
		
		String newStr = str.replaceAll(",$", "");
		System.out.println(newStr);
		
		String str = "Hello, World, Java,";

        String newStr = str;
        if (newStr.endsWith(",")) {
            newStr = newStr.substring(0, newStr.length() - 1);
        }
        System.out.println(newStr);
		*/
		

		
		
		/*
		// 지정한 첫 번째 index 부터 두 번째 index 직전 까지의 문자열을 반환
		String str1 = "Java";
		System.out.println(str1.substring(0,3));
		
		
		String con = dc.ic[0].press;
//		System.out.println(Arrays.toString(con));
		
		String keyword1 = "길벗";
		
		String[] split = con.split(" ");
		
//		System.out.println(Arrays.toString(split));
//		System.out.println(split.length);
		
		int resultNum[] = new int[4];
		
		for(int i=0; i<split.length; i++) {
			 if(keyword1.contains(split[i])) {
				 resultNum[0]++;
			 }
			 if(keyword1.equals(split[i])) {
				 resultNum[0]++;
			 }
		}
		
		System.out.println(Arrays.toString(split));
		System.out.println(split.length);
		
		*/
		
		
		
	}

}
