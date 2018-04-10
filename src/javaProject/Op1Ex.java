package javaProject;

import java.util.Scanner;

public class Op1Ex {

	public static void main(String[] args) {
		// 문제 : 초 단위로 정수를 입력받아 몇시, 몇분, 몇초인지 구하여 출력하는 프로그램
		
		Scanner scanner = new Scanner (System.in);
		//키보드로 입력받기 위한 객체 생성 ==>1단계
		System.out.println("정수를 입력하세요:");
		int time = scanner.nextInt();
		//2단계 : 키보드로 입력한 값을 읽어옴
		//nextInt() : //정수로 저장
		
		int hour = time/3600; //정수/3600 ==> 1시간은 60*60 초
		int minute = time%3600/60; //분 ==>time 나머지값
		int second = time%60; //초
		
		System.out.println(time + "초는" + hour + "시"+ minute + "분" + second + "초");
		
		
		
		//문제 : 입력된 정수가 짝수인지 홀수인지 출력
		System.out.println("숫자를 입력하세요");
	    int n = scanner.nextInt();
	    //String b;
	    //b=((n%2)==0)? "짝수" : "홀수";
	    
	    int a = n%2;
	    String b;
	    b=(a==0)? "짝수" : "홀수";
	    System.out.println( n + "은 " + b + "입니다.");
		
		
	    //문제 : 임의의 수를 입력 받아 십의 자리 이하는 버리는 코드
	    System.out.println("세자리수 이상의 정수를 입력하세요");
	    int m = scanner.nextInt(); 
	    int p= (m/100)*100;
	    System.out.println( "결과는 " + p + "입니다.");
	}

}
