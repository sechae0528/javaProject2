package javaTest1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//�迭 �ٷ��
		//2���� �迭 ����� ���ÿ� �� �ʱ�ȭ
		int [][] salesTable = {{72, 85, 93, 97}, 
				{136, 178, 154, 239},{52, 178, 154, 239}, 
				{156, 170, 203, 236},{94, 123, 156, 178}};
		
		//int [][] salesTable2 = new int[5][4];
		//Scanner scan = new Scanner(System.in);
		//salesTable2 = scan.
		
		 String [] names = {"ȫ�浿", "�Ӳ���", "�谩��", "��ĥ��", "������"};
		 
		 double [] rowaverage = new double [5];
		 double [] columnaverage = new double [4];
		 
		 int i,j, sum;
		 
		 System.out.println("�Ǹſ�\t 1�б�\t 2�б�\t 3�б�\t 4�б�");
		 System.out.println("---------------------------------------");
		 
		 for (i=0; i<5; i++){
			 System.out.print(names[i]);
			 for (j=0; j<4; j++){
				 System.out.print("\t" + salesTable[i][j]);
			 }
			 System.out.println();
		 }
		 System.out.println();
		 
		 //������� ==> ex> ȫ�浿 1~4�б� ���
		 for (i=0; i< salesTable.length; i++){
			 sum = 0;
			 for ( j=0; j < salesTable[i].length; j++){
				 sum = sum + salesTable[i][j];
			 }
			 rowaverage[i] = sum / 4.0; //int / double => double
			System.out.println(names[i]+"�� ��� �ǸŴ��: "+ rowaverage[i]);
		 }
		 
		 //������� ==> ex> 1��б��� �����
		 System.out.println();
		 for (j=0; j<4; j++){
			 sum = 0;
			 for ( i = 0; i<5; i++){
				 sum = sum + salesTable[i][j];
			 }
			 columnaverage[j] = sum/5.0;
			 System.out.println((j+1)+"�б��� ��� �ǸŴ��: "+ columnaverage[j] );
		 }
	}

}
