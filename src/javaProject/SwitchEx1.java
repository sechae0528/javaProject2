package javaProject;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		//기본 switch
		int num=6;
		switch(num){
		case 1: //if(num==1)
			System.out.println("sk");
			break;
		case 6: 
			System.out.println("KTF");
			break;
		default : //else
			System.out.println("unknown");
		}
		
		//키보드로 입력받아서 처리
		Scanner scanner = new Scanner(System.in);
		System.out.print("현재 월을 입력하세요: ");
		int month =0;
		month = scanner.nextInt();
		
		switch(month){
		case 3: case 4: case 5: //if(month <=5) //3~5
			System.out.println("현재 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("가을입니다.");
			break;
		default:
			System.out.println("겨울입니다.");
		}
		
		//연산식을 간단한 수식으로 작성하는 예
		int score=0;
		System.out.print("점수를 입력하세요: ");
		score = scanner.nextInt();
		
		switch(score/10){ //십의 자릿수 99~90 / 10 =>9
		case 10: case 9:
			System.out.println("A");
			break;
		case 8: //if(score>=80)
			System.out.println("B");
			break;
		default: 
			System.out.println("c");
		}
		
	
	}

}
