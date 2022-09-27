package org.joonzis.class03;

import java.util.Calendar;

//import org.joonzis.class02.DataClass;

public class OperClass {
	

	int avgHireDate;
	
	void avgHireDate(InfoClass[] info) {	//info 통해서 전달 받을 예정
		// 평균 재직 년수 (올해 - 입사 년도)
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);	// 현재 년도
		int sum = 0;		// 재직 년수 합
		double avg = 0;		// 평균 재직 년수
		
//		년수만 뽑아오려면 2가지 방법이 있다
//		1) split
//		2) substring
		String[] s;	// 년-월-일 형식의 문자열 split 저장 배열
		
		for(int i=0 ; i<info.length; i++) {
			s = info[i].hireDate.split("-");	// "2022-09-27" 데이터 split
//			System.out.println(s[0]);	// 년도가 들어가져 있음 -> 정확한 데이터인지 찍어보기
			sum += (year - Integer.parseInt(s[0]));	// 현재년도-입사년도
		}
		avg = (double)sum/info.length;
		System.out.println("전체 직원의 평균 재직 년수 : " + (int)avg + "년");	
	}
		
		

	
	void search(InfoClass[] info, String searchYear) {
		
		String names = "";	// 직원들 목록 저장 변수
		String[] s;
		for(int i=0 ; i<info.length; i++) {
			s = info[i].hireDate.split("-");	// s에 내가 받아온 searchYear와 값이 같은지 확인
			if(s[0].equals(searchYear)) {
				names += info[i].eName + ", ";
//				System.out.println(info[i].eName);
				
			}
		}	
		
		if(names.equals("")) {
			System.out.println("해당 사원이 없습니다");
		}else {
			names = names.substring(0, names.length()-2);	// 직접 -1, -2 처럼 하나씩 찍어보면서 문자열 잘리는지 판단
			System.out.println(names);
		}
		
//		System.out.println(names);
		
	}
	
	
}
