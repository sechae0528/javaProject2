package javaProject;

import java.util.Scanner;

public class Op1 {

	public static void main(String[] args) {
		
		//���� ����
		int remainder = 25%2; 
		System.out.println("�������� "+ remainder + "�Դϴ�.");
		
		
		//�񱳿�����
		int x =0, y=1;
		boolean z;
		
		z= ((x<1) || (y--<1)); // x=0<1 or y=1<1 => y=0
		System.out.println("����� :" +z);
		
		z= ((x<1) && (y--<1)); //x=0<1 and y=1<1 => y=0
		System.out.println("����� :" +z);
		
		
		//���Կ�����
		int value =1;
		value +=2; // value = value+2;
		System.out.println("���: " + value);
		
		//��ȣ������
		x=1;
		y=1;
	    System.out.println("x="+x+ " x++="+ x++); //x=1����� x=x+1 
	    System.out.println("x="+x+ " --x="+ --x); //x=--x�Ŀ� x�����
	    System.out.println("y="+y+ " y++="+ x++);
	    System.out.println("y="+y+ " --y="+ --y);
		
	    //���� ������
	    x=1;
	    y=(x==1)? 10 : 20; //����?���϶� �� : �����϶� ��;
	    System.out.println("����� : "+ y);
					
	    
	    //����
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("���ڸ� �Է��ϼ���");
	    int n = in.nextInt();;
	    
	    int a = n%2;
	    String b;
	    b=(a==0)? "¦��" : "Ȧ��";
	    System.out.println( n + "�� " + b + "�Դϴ�.");
	    
	    
	    
	}

}
