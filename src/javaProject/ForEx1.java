package javaProject;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {
		//ȭ�鿡 1~10���� ���� ����ִ� ����
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		
		//���� ��µǴ� ������ for������ ����
		for(int i=1; i<=5; i++){
			System.out.println(i);
		}
		
		//1~10������ ��
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
		}//System.out.println("1-10������ ��: "+sum);
		
		//����ڷκ��� �Է¹��� ���� �ݺ�
//		int dan =0;
//		System.out.print("���� �Է��ϼ���: ");
		Scanner scanner = new Scanner(System.in);
//		dan = scanner.nextInt();
//		for (int i2=1; i2 <=9; i2++){
//			System.out.println(dan + "*" + i2 + "=" + dan*i2);
//		}
//		
		//2~9�ܱ��� �ݺ��ϱ�
		//���� �ݺ� (2~9)
		//�� �ܸ��� (1~9)
		
		for(int i3=2; i3<10; i3++){ //���� �ݺ�
			for(int j3=1; j3<10; j3++){
				System.out.print(i3 + "*" + j3 + "=" + i3*j3); // ������ ���
				System.out.print('\t'); // �ϳ��� ������ ���
//				System.out.println(i3 + "*" + j3 + "=" + i3*j3);
			}
			System.out.println(); 
		}
		
		
		//1���� 20������ �����߿��� 3�� ����� ������ ���ϼ���
		int sum4=0;
		for(int m=1; m<=20; m++){ //for(i=0; i<=20; i=i+3) for���� ����ϴ� ���
			if(m%3==0){
				sum4 += m;
			}		
		}System.out.println(sum4);
		
		
		//�ణ �����ؼ� 3�� ����� 2�� ����� �ƴ� ���� ��
		int sum5=0;
		for(int w=1; w<=20; w++){
			if(w%2!=0 && w%3!=0){
				sum5 += w;
			}
		}System.out.println(sum5);
	
	}
}
