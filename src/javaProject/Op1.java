package javaProject;

import java.util.Scanner;

public class Op1 {

	public static void main(String[] args) {
		
		//변수 선언
		int remainder = 25%2; 
		System.out.println("나머지는 "+ remainder + "입니다.");
		
		
		//비교연산자
		int x =0, y=1;
		boolean z;
		
		z= ((x<1) || (y--<1)); // x=0<1 or y=1<1 => y=0
		System.out.println("결과는 :" +z);
		
		z= ((x<1) && (y--<1)); //x=0<1 and y=1<1 => y=0
		System.out.println("결과는 :" +z);
		
		
		//대입연산자
		int value =1;
		value +=2; // value = value+2;
		System.out.println("결과: " + value);
		
		//부호연산자
		x=1;
		y=1;
	    System.out.println("x="+x+ " x++="+ x++); //x=1출력후 x=x+1 
	    System.out.println("x="+x+ " --x="+ --x); //x=--x후에 x값출력
	    System.out.println("y="+y+ " y++="+ x++);
	    System.out.println("y="+y+ " --y="+ --y);
		
	    //조건 연산자
	    x=1;
	    y=(x==1)? 10 : 20; //조건?참일때 값 : 거짓일때 값;
	    System.out.println("결과는 : "+ y);
					
	    
	    //문제
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("숫자를 입력하세요");
	    int n = in.nextInt();;
	    
	    int a = n%2;
	    String b;
	    b=(a==0)? "짝수" : "홀수";
	    System.out.println( n + "은 " + b + "입니다.");
	    
	    
	    
	}

}
