package javaTest1;

import java.util.Scanner;

public class arrayTest {
	public static void main(String[] args)  {
		
				Scanner scan = new Scanner(System.in);
		
		//�迭 �ٷ��
				//2���� �迭 ����� ���ÿ� �� �ʱ�ȭ
				int [][] salesTable = {{72, 85, 93, 97}, 
						{136, 178, 154, 239},{52, 178, 154, 239}, 
						{156, 170, 203, 236},{94, 123, 156, 178}};
				
				
				int [][] salesTable2 = new int[5][4];
				int i, j, sum;
				
				for(i=0; i<5; i++){
					for(j=0; j<4; j++){
						System.out.print("���ϴ� ���� �Է�>>");
						salesTable2[i][j] = scan.nextInt();
					}
				}
				
				for(i=0; i<5; i++){
					for(j=0; j<4; j++){
						System.out.print(salesTable2[i][j] + " ");					
					}
					System.out.println();
				}
				
				String [] names = {"ȫ�浿", "�Ӳ���", "�谩��", "��ĥ��", "������"};
				 
				 double [] rowaverage = new double [5];
				 double [] columnaverage = new double [4];
				 
				 System.out.println("�Ǹſ�\t 1�б�\t 2�б�\t 3�б�\t 4�б�");
				 System.out.println("---------------------------------------");
				 
				 for (i=0; i<5; i++){
					 System.out.print(names[i]);
					 for (j=0; j<4; j++){
						 System.out.print("\t" + salesTable2[i][j]);
					 }
					 System.out.println();
				 }
				 System.out.println();
				 
				 //������� ==> ex> ȫ�浿 1~4�б� ���
				 for (i=0; i< salesTable2.length; i++){
					 sum = 0;
					 for ( j=0; j < salesTable2[i].length; j++){
						 sum = sum + salesTable2[i][j];
					 }
					 rowaverage[i] = sum / 4.0; //int / double => double
					System.out.println(names[i]+"�� ��� �ǸŴ��: "+ rowaverage[i]);
				 }
				 
				 //������� ==> ex> 1��б��� �����
				 System.out.println();
				 for (j=0; j<4; j++){
					 sum = 0;
					 for ( i = 0; i<5; i++){
						 sum = sum + salesTable2[i][j];
					 }
					 columnaverage[j] = sum/5.0;
					 System.out.println((j+1)+"�б��� ��� �ǸŴ��: "+ columnaverage[j] );
				 }
				 
				
	}
}
