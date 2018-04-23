package javaTest1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// 조건문 연습 문제
		double grade; //평점
		int toeicscore;  //토익점수
		
		//Scanner 클래스 사용
		Scanner scan = new Scanner(System.in);
		//평점을 입력받는다.
		System.out.print("평점을 입력하세요: ");
		grade = scan.nextDouble();
		//토익점수를 입력받는다.
		System.out.print("TOEIC 점수를 입력하세요: ");
		toeicscore = scan.nextInt();
		
		//평점과 토익 점수에 따라 지원시 적절한 메시지 출력
		if (toeicscore >=700){
			if(grade >= 4.0){
				System.out.println("면접 대상자입니다.");
			}else if (grade >= 3.5){
				System.out.println("서류전형 대상자입니다.");
			}else if (grade >= 3.0){
				System.out.println("필기 시험 대상자입니다.");
			}else {
				System.out.println("지원할 수 없습니다.");
			}	
		}else {
			System.out.println("지원할 수 없습니다.");
		}
	}

}
