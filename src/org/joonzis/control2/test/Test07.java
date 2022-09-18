package org.joonzis.control2.test;

public class Test07 {
	public static void main(String[] args) {
		
//		Q7. 피보나치 수열은 앞의 두 수를 더해서 다음 수를 만들어나가는 수열이다.
//		예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고
//		그 다음 수는 1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21...과 같은 식으로 진행된다. 
//		1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇인지 계산하시오.
		
		int ans=0;	//결과값이 나오는 변수
		int num1 = 1;
		int num2 = 1;
		int count=10;	//~번째 수 지정
		System.out.print(num1 + " " + num2  + " ");
		
		for (int i=0; i<count-2; i++) {	// 2번째 수 까지 정해졌기 때문에 8번만 반복하면 됨
			ans= num1 + num2;
			num1= num2;
			num2 =ans;
			System.out.print(ans + " ");
		}
		System.out.println("피보나치수열의 10번째 수 : " + ans);
		
		
		
		/*
		답안2)
		int num1 = 1;
		int num2 = 1;
		int ans=0;	//결과값이 나오는 변수
		
		System.out.print(num1 + "" + num2 + "");	//초기값이 빠져있으니 for 밖에서 사용할 것, 아래 for문 먼저 작성 후 작성한 식
		for (int i=0; i<8; i++) {	//첫 번째와 두 번째가 돌았기 때문에 10번이 아니라 8번만 돌면 된다.	
			ans= num1 + num2;	//결과값
			num1= num2;	//첫번째 변수 값에 두번째 값을 대입
			num2 =ans;	//결과값 대입
			System.out.print(ans + " ");
		}
		System.out.println("피보나치수열의 10번째 수 : " + ans);
		*/
		
		
		
		
		
		
	}
}
