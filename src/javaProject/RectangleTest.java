//��ü �����
//
//��ü���� ��ȣ �ۿ� ( �޼��� ���޹��)
//
//1.��ü. �޼��� ()
//
//2. �����ڸ� ���ؼ� ����
//
//3. getter/setter() ���ؼ��� ����
//	getter : ��ü�� ����� �ʵ庯������ �˰� ���� ��
//	setter : ��ü�� �ʵ庯������ ���Ӱ� ������ ��
//
// ex> ��ü��. �ʵ庯�� = ��; //setter �ǹ�
//     ���� = ��ü��.�ʵ庯�� ; //getter �ǹ�

package javaProject;

import java.util.Scanner;

class Rect {
	private double width, length; //�ʵ�(�������)
	//�⺻������ 
	public Rect() {		
//		this.width = 10.0;
//		this.length = 10.0;
		this(10.0, 10.0); //����		
	}
	
	//�Ű����� 2�� ������
	public Rect(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	//setter/getter �޼��� ����

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	//��� �޼���
	public double calcArea(){
		return width * length;
	}
	//toString() : ��ü�� ó���� ����� ���ڿ��� ����
	//������ü(object)���� �����ϴ� �޼���
	public String toString(){
		return "���� " +width +" ���� " + length + "���̴� " + calcArea();//��¹���
	}
	
}

public class RectangleTest {
	
	public static void main(String[] args) {
		Rect r1 = new Rect(); //�⺻������
		System.out.println("����=" + r1.getWidth());
		System.out.println("����=" + r1.getLength());
		System.out.println("����=" + r1.calcArea());
		Rect r2 = new Rect(5.5, 10.0); //�Ű����� ������
		System.out.println(r2); //��ü ������ ��� ==> toString()
		r2.setWidth(20.0);
		System.out.println(r2.toString());
//		System.out.println(r2); //���� ǥ��


		//���� ���θ� ���� �Է¹޾� ����Ʈ�ϱ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ���� ���� �Է��ϼ���>>");
		Double a = scanner.nextDouble();
		Double b = scanner.nextDouble();
		Rect r3 = new Rect(a, b);
		System.out.println(r3);

	}
}


//�⺻������, �Ű����� ������ setter/getter �޼��� ��� �ڵ��ϼ����� ����� �ȴ�.
//source -> generate using Field �� generate getter/setter �̿�

