package javaTest1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// ���ǹ� ���� ����
		double grade; //����
		int toeicscore;  //��������
		
		//Scanner Ŭ���� ���
		Scanner scan = new Scanner(System.in);
		//������ �Է¹޴´�.
		System.out.print("������ �Է��ϼ���: ");
		grade = scan.nextDouble();
		//���������� �Է¹޴´�.
		System.out.print("TOEIC ������ �Է��ϼ���: ");
		toeicscore = scan.nextInt();
		
		//������ ���� ������ ���� ������ ������ �޽��� ���
		if (toeicscore >=700){
			if(grade >= 4.0){
				System.out.println("���� ������Դϴ�.");
			}else if (grade >= 3.5){
				System.out.println("�������� ������Դϴ�.");
			}else if (grade >= 3.0){
				System.out.println("�ʱ� ���� ������Դϴ�.");
			}else {
				System.out.println("������ �� �����ϴ�.");
			}	
		}else {
			System.out.println("������ �� �����ϴ�.");
		}
	}

}
