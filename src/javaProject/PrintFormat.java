package javaProject;



public class PrintFormat {

    public static void main(String[] args){

        int i = 97;
        String s="java";
        double f=3.14f;

        System.out.printf("������� : %d\n", i); //10���� �������
        System.out.printf("������� : [%10d]\n", i); //10�ڸ�
        System.out.printf("������� : %s\n", s); //���ڿ� ���
        System.out.printf("������� : [%10s]\n", s); //10�ڸ�
        System.out.printf("�Ǽ���� : [%5.1f]\n", f ); //�ټ��ڸ��� �Ҽ��� ���ڸ�

    }
}
