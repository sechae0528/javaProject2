package javaProject;


import java.util.Scanner; //Ű����κ��� ������ �Է��� ���� ��, ����Ʈ ��ĳ�� ���

public class ScannerEx {

    public static void main(String[] args){

        //��ü ����
        //Ŭ���� ���� = new Ŭ����();
        System.out.print("���ڸ� �� �� �Է�>>");
       

 	Scanner in = new Scanner(System.in); //Scanner ��ü ����


        int x = in.nextInt(); //��ü���� : ��ü������.�޼ҵ�();
        int y = in.nextInt();

        System.out.printf("%d * %d�� %d�Դϴ�.\n", x, y, x*y);

        System.out.println("�̸��� ���̸� �Է��ϼ���");
        String name = in.next();
        int age = in.nextInt();
        System.out.println("����� �̸��� "+ name + ", ���̴� " + age + "�Դϴ�");



 //���� : ���簢���� ���� ���� ���� �Է¹޾Ƽ� ���̸� ���ϴ� �ǽ�

        System.out.println("���簢���� ���θ� �Է��ϼ���");
        int a = in.nextInt();

        System.out.println("���簢���� ���θ� �Է��ϼ���");
        int b = in.nextInt();

        System.out.printf("���簢���� ���δ� %d, ���δ� %d, ���簢���� ���̴� %d �Դϴ�.", a,b,a*b );




    }




}
