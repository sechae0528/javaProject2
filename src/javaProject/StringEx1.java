package javaProject;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		//���ڿ��� ==> �迭ó�� �ε��� ��ȣ�� �����鼭 ����
		String a="Hello";
		String b = new String("java"); //�Ѵ� ���� ���
		
		System.out.println("�ܾ�a: " +a);
		System.out.println("a�� ���ڰ���: " +a.length());
		System.out.println("a�� 0������ 2���������� ����: " +a.substring(0,2));
		System.out.println("a�� 3��°����: " +a.charAt(3));
		String s[] =a.split(","); //���ڿ��� ,�� �����ؼ� �迭�� ����
		
		for(int i=0; i<s.length; i++){
			System.out.println(s[i]);
		}
		
		//���ڿ� + �迭�� Ȱ���� ������ �Է��ϸ� �ѱ۷� ����
		String eng[] = {"student", "love", "java", "happy","future"};
		String kor[] = {"�л�","���","�ڹ�","�ູ","�̷�"};
		
		//����ڷκ��� �Է¹޾Ƽ� ���
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.print("����ܾ �Է��ϼ���>> ");
			String s1=scanner.nextLine();
			if(s1.equals("exit")){
				System.out.println("����Ǿ����ϴ�.");
				break; //s1(���� �Է��� ����)�� exit��� �ߴ�
			}
			for(int i1=0; i1<eng.length; i1++){
				//�迭 ���� ��ŭ �ݺ�
				if(eng[i1].equals(s1)){
					//�迭�� ����� ���� ���� �Է��� ���� ������
					System.out.println(kor[i1]);
					break;
				}
			}
			
		}
		
		//����ڷκ��� �Է¹��� �ϳ��� ���ڸ� ���ϱ�
		char ch = ' ';
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���>>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);

		
		if('0'<= ch && ch <='9'){
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.\n");
		}
		if(('a'<=ch && ch <= 'z') || ('A'<=ch && ch <='Z')){
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.\n");
		}
		
		
		//��ҹ��� ��ȯ�ϱ�
		char ch1 = ' ';
		System.out.printf("�����ڸ� �Է��ϼ���>>");
		
		String input1 = scanner.nextLine();
		ch1 = input1.charAt(0);
		
		//toUpperCase() : ��� ���ڿ� ���ؼ� �ҹ��ڸ� �빮�ڷ� �ٷ� ��ȯ
				System.out.println("�ҹ���=>�빮�� "+input1.toUpperCase()); 
				//toLowerCase() : ��� ���ڿ� ���ؼ� �빮�ڸ� �ҹ��ڷ� �ٷ� ��ȯ
				System.out.println("�빮��=>�ҹ��� "+input1.toLowerCase());
				
				if('a'<=ch1 && ch1 <= 'z'){
					ch1 = (char)(ch1-32); //�빮�ڸ� �ҹ��ڷ� �ٲ���. ������ ũ�⸸ŭ ���ڷ� ���ش��� �ٽ� char�� ������ȯ
				}else if ('A'<=ch1 && ch1 <='Z'){
					ch1 = (char)(ch1+32); //�ҹ��ڸ� �빮�ڷ� ��ȯ
				}
				System.out.println("ù���ڸ� ��ҹ��� ��ȯ: "+ch1);

	}

}
