//���Ŭ���� ���

package javaProject;

//point Ŭ����
class Point {
	private int x,y;
	//�⺻������ ���� ==> �����Ϸ��� ���� �ڵ����� ����
	
	void set(int x, int y){//�޼��� ����
		this.x =x;
		this.y =y;
		
	}
	void showPoint(){ //�޼��� ����
		System.out.println("("+ x + ", " + y+")");
	}
}

//��ӹ��� ColorPoint Ŭ����
class ColorPoint extends Point { //���� extends ����
	//����Ŭ���������� ����� �߰� ���
	private String color;
	void setColor(String color){
		this.color = color;
	}
	void showColorPoint(){
		System.out.print(color);
		showPoint(); //������ �ִ� �޼��� ȣ��
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		//��ü ����
		Point p = new Point();
		p.set(1, 2); //set ȣ��
		p.showPoint(); //Point Ŭ�������������� ȣ��
		
		//��ü ���� ==> ��ӹ��� ��ü
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();

	}

}
