package javaProject;

public class Rectangle {
	int width; //�ʵ� ==> public�� �����ϸ� default (public�� �� ū ����)
	int height;
	int getArea(){
		return width*height;
	}
	public Rectangle(){
		
	}
	
	public Rectangle(int a, int b){
		width = a;
		height = b;
	}

}
