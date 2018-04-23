package javaTest1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//while ==> 무한으로 반복
		int score; 
		int totalCount = 0;
		int Acount, Bcount, Ccount, Dcount, Fcount;
		Acount = Bcount = Ccount = Dcount = Fcount = 0;
		
		//Scanner 클래스 사용
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요(종료하려면 -1을 입력): ");
		score = scan.nextInt();
		
		while (score >= 0) { //while(ture)
			totalCount++;
			if(score >= 90) {
				Acount++;
			}else if (score >= 80){
				Bcount++;
			}else if (score >= 70){
				Ccount++;
			}else if (score >= 60){
				Dcount++;
			}else
				Fcount++;
			
			System.out.print("점수를 입력하세요(종료하려면 -1을 입력): ");
			score = scan.nextInt();
		}
		//화면에 값출력
		System.out.println();
		System.out.println("점수들의 총수=" + totalCount);
		System.out.println("A 학점의 수=" + Acount);
		System.out.println("B 학점의 수=" + Bcount);
		System.out.println("C 학점의 수=" + Ccount);
		System.out.println("D 학점의 수=" + Dcount);
		System.out.println("F 학점의 수=" + Fcount);
	}

}
