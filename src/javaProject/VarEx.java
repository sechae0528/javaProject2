package javaProject;

public class VarEx {

    public static void main(String[] args){
        //���� + ����, �Ǽ� ���ͷ� ����

        int mach; //���� ���� ==> 4byte
        int distance;

        mach = 340; //int mach = 340; �ʱ�ȭ
        distance= mach*60*60;

        System.out.println("1�ð� ���� ���� �Ÿ�" + distance + "m");

        double radius = 10.0;
        final double PI = 3.141592;
        double area = radius * radius * PI;
        System.out.println("��������"+ radius + "�� ���� ���� : " + area);

        radius = 100.0;
        area = radius * radius * PI;
        System.out.println("��������"+ radius + "�� ���� ���� : " + area);

        
        //����, �� Ÿ�� ����
        char ga1 = '��';
        char ga2 = '\uac00';
        String str = "hello";
        boolean cham = true;
        System.out.println("������� " + ga1 + ga2);
        System.out.println("�� " + cham);

  

	 //Ÿ�� ��ȯ
        int i;
        double d, d1;
        i=7/4; //Ÿ�Ժ�ȯ�� ���� �ʰ� ��� ==>�ս��� ����
        System.out.println(i);

        d=7/ (double)4;
        d1 = 7/4.0;
        System.out.println("��°�� d :" + d+ " ��°�� d1:"+ d1);

        double d2 = 1.999999;
        int j = (int)d2;
        System.out.println(j);

        byte b = (byte)300;
        System.out.println(b);
    }
}
