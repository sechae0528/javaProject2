package javaProject;


class Shape {
	public void draw(){
		System.out.println("도형");
	}//접근자 리턴타입 메서드이름(매개변수..)
}

class Line extends Shape{
	public void draw(){
		System.out.println("선");
	}
}

class Rect extends Shape{
	public void draw(){
		System.out.println("사각형");
	}
}

class Circle extends Shape{
	public void draw(){
		System.out.println("원");
	}
}

public class OverridingEx {
	static void paint(Shape p){
		p.draw(); //상위클래스에 있는 draw()
	}
	public static void main(String[] args) {
		//메서드 호출
		Line line = new Line();
		paint(line); //Shape line ==> line에 draw호출
		//오버라이딩 된 메서드는
		//일단 겹쳐서 사용한 것이므로
		//하위 클래스에 있는 메서드가 우선적으로 실행
		paint(new Line()); //위에 두줄과 동일
		line.draw();//동일

	}
}
