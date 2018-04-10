package javaProject;

public class Rectangle {
	int width; //필드 ==> public을 생략하면 default (public이 더 큰 범위)
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
