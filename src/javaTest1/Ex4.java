package javaTest1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//배열 다루기
		//2차원 배열 선언과 동시에 값 초기화
		int [][] salesTable = {{72, 85, 93, 97}, 
				{136, 178, 154, 239},{52, 178, 154, 239}, 
				{156, 170, 203, 236},{94, 123, 156, 178}};
		
		//int [][] salesTable2 = new int[5][4];
		//Scanner scan = new Scanner(System.in);
		//salesTable2 = scan.
		
		 String [] names = {"홍길동", "임꺽정", "김갑돌", "이칠복", "강진주"};
		 
		 double [] rowaverage = new double [5];
		 double [] columnaverage = new double [4];
		 
		 int i,j, sum;
		 
		 System.out.println("판매원\t 1분기\t 2분기\t 3분기\t 4분기");
		 System.out.println("---------------------------------------");
		 
		 for (i=0; i<5; i++){
			 System.out.print(names[i]);
			 for (j=0; j<4; j++){
				 System.out.print("\t" + salesTable[i][j]);
			 }
			 System.out.println();
		 }
		 System.out.println();
		 
		 //가로평균 ==> ex> 홍길동 1~4분기 평균
		 for (i=0; i< salesTable.length; i++){
			 sum = 0;
			 for ( j=0; j < salesTable[i].length; j++){
				 sum = sum + salesTable[i][j];
			 }
			 rowaverage[i] = sum / 4.0; //int / double => double
			System.out.println(names[i]+"의 평균 판매대수: "+ rowaverage[i]);
		 }
		 
		 //세로평균 ==> ex> 1사분기의 총평균
		 System.out.println();
		 for (j=0; j<4; j++){
			 sum = 0;
			 for ( i = 0; i<5; i++){
				 sum = sum + salesTable[i][j];
			 }
			 columnaverage[j] = sum/5.0;
			 System.out.println((j+1)+"분기의 평균 판매대수: "+ columnaverage[j] );
		 }
	}

}
