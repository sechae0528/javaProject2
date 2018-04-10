package javaProject;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		//화면에 1~10까지 숫자 찍어주는 예제
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		
		//위에 출력되는 내용을 for문으로 변경
		for(int i=1; i<=5; i++){
			System.out.println(i);
		}
		
		//1~10까지의 합
		int i1, sum=0;
		for(i1=1; i1<=10; i1++){
			sum += i1; //sum = sum+i1;
			System.out.print(i1);
			if(i1<=9){
				System.out.print("+");
			}else {
				System.out.print("=");
				System.out.println(sum);
			}
		}//System.out.println("1-10까지의 합: "+sum);
		
		//사용자로부터 입력받은 값을 반복
//		int dan =0;
//		System.out.print("단을 입력하세요: ");
		Scanner scanner = new Scanner(System.in);
//		dan = scanner.nextInt();
//		for (int i2=1; i2 <=9; i2++){
//			System.out.println(dan + "*" + i2 + "=" + dan*i2);
//		}
//		
		//2~9단까지 반복하기
		//단의 반복 (2~9)
		//각 단마다 (1~9)
		
		for(int i3=2; i3<10; i3++){ //단의 반복
			for(int j3=1; j3<10; j3++){
				System.out.print(i3 + "*" + j3 + "=" + i3*j3); // 구구셈 출력
				System.out.print('\t'); // 하나씩 탭으로 띄기
//				System.out.println(i3 + "*" + j3 + "=" + i3*j3);
			}
			System.out.println(); 
		}
		
		
		//1부터 20까지의 정수중에서 3의 배수의 총합을 구하세요
		int sum4=0;
		for(int m=1; m<=20; m++){ //for(i=0; i<=20; i=i+3) for문만 사용하는 경우
			if(m%3==0){
				sum4 += m;
			}		
		}System.out.println(sum4);
		
		
		//약간 변형해서 3의 배수와 2의 배수가 아닌 수의 합
		int sum5=0;
		for(int w=1; w<=20; w++){
			if(w%2!=0 && w%3!=0){
				sum5 += w;
			}
		}System.out.println(sum5);
	
	}
}
