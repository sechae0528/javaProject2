package javaProject;

import java.util.Scanner;

public class Op1Ex {

	public static void main(String[] args) {
		// ���� : �� ������ ������ �Է¹޾� ���, ���, �������� ���Ͽ� ����ϴ� ���α׷�
		
		Scanner scanner = new Scanner (System.in);
		//Ű����� �Է¹ޱ� ���� ��ü ���� ==>1�ܰ�
		System.out.println("������ �Է��ϼ���:");
		int time = scanner.nextInt();
		//2�ܰ� : Ű����� �Է��� ���� �о��
		//nextInt() : //������ ����
		
		int hour = time/3600; //����/3600 ==> 1�ð��� 60*60 ��
		int minute = time%3600/60; //�� ==>time ��������
		int second = time%60; //��
		
		System.out.println(time + "�ʴ�" + hour + "��"+ minute + "��" + second + "��");
		
		
		
		//���� : �Էµ� ������ ¦������ Ȧ������ ���
		System.out.println("���ڸ� �Է��ϼ���");
	    int n = scanner.nextInt();
	    //String b;
	    //b=((n%2)==0)? "¦��" : "Ȧ��";
	    
	    int a = n%2;
	    String b;
	    b=(a==0)? "¦��" : "Ȧ��";
	    System.out.println( n + "�� " + b + "�Դϴ�.");
		
		
	    //���� : ������ ���� �Է� �޾� ���� �ڸ� ���ϴ� ������ �ڵ�
	    System.out.println("���ڸ��� �̻��� ������ �Է��ϼ���");
	    int m = scanner.nextInt(); 
	    int p= (m/100)*100;
	    System.out.println( "����� " + p + "�Դϴ�.");
	}

}
