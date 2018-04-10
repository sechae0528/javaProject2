package javaProject;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age = scanner1.nextInt();
		//단순 if문
		if((age>=20) && (age<30)){
			System.out.println("20대 입니다.");
		
		}else {
			System.out.println("20대가 아닙니다.");
		}
		
		//if~else if(이중 if문, 다중 if문 ==> 조건을 여러개..)
		System.out.print("점수를 입력하세요: ");
		int score = scanner1.nextInt();
		char grade;
		
		if(score>=90){
			grade = 'A';
		}else if(score>=80){
			grade = 'B';
			
		}else if(score>=70){
			grade = 'C';
			
		}else if(score>=60){
			grade = 'D';
			
		}else {
			grade='F';
		}
		System.out.println("학점은 "+ grade+ "입니다.");	
		//System.out.printf("학점은 %c 입니다.",grade);
		
		
		//중첩 if문 ==> if문 조건안에 또다른 if문을 쓰는 경우
		System.out.print("점수입력하세요: ");
		int score1 = scanner1.nextInt();
		System.out.print("학년을 입력하세요: ");
		int year = scanner1.nextInt();
		
		if (score1>=60){
			if(year != 4){
				System.out.println("합격입니다.");
			}else if(score1>=70){
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}//4학년에 대한 조건
		}else {
			System.out.println("불합격입니다!!");
			
			
		}
	}
	
}
