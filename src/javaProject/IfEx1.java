package javaProject;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ���: ");
		int age = scanner1.nextInt();
		//�ܼ� if��
		if((age>=20) && (age<30)){
			System.out.println("20�� �Դϴ�.");
		
		}else {
			System.out.println("20�밡 �ƴմϴ�.");
		}
		
		//if~else if(���� if��, ���� if�� ==> ������ ������..)
		System.out.print("������ �Է��ϼ���: ");
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
		System.out.println("������ "+ grade+ "�Դϴ�.");	
		//System.out.printf("������ %c �Դϴ�.",grade);
		
		
		//��ø if�� ==> if�� ���Ǿȿ� �Ǵٸ� if���� ���� ���
		System.out.print("�����Է��ϼ���: ");
		int score1 = scanner1.nextInt();
		System.out.print("�г��� �Է��ϼ���: ");
		int year = scanner1.nextInt();
		
		if (score1>=60){
			if(year != 4){
				System.out.println("�հ��Դϴ�.");
			}else if(score1>=70){
				System.out.println("�հ��Դϴ�.");
			}else {
				System.out.println("���հ��Դϴ�.");
			}//4�г⿡ ���� ����
		}else {
			System.out.println("���հ��Դϴ�!!");
			
			
		}
	}
	
}
