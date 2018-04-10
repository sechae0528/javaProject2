package javaProject;





public class Circle {
	public int radius; //필드(=멤버변수)
	public String name; //필드
	//필드 : circle클래스가 가지는 특징
	// ==> 이 필드를 이용해서 메소드에서 작업(역할부여)
	
	//기본생성자 ==>  클래스 이름
		//접근자 클래스이름()...
	public Circle(){
			
	}
		
	//매개변수가 있는 생성자
	public Circle(int r, String n){
		radius = r; //클래스 필드=전달되는 값
		name = n;
	}
	
	
	//메소드 => 역할부여
	//접근자 리턴타입 메서드이름(.. ) { }
	public double getArea(){
		return 3.14*radius*radius;
		//3.14*this.radius*this.radius
		//3.14*Circle.radious*Circle.radius
		
	
	}

	public static void main(String[] args) {
	//Circle 클래스에 있는 변수와 메서드를 가져다 쓰려면
	Circle pizza; //클래스명 변수명
	pizza = new Circle(); //객체틀에서 찍어서 사용하기(인스턴스)
	pizza.radius = 10;
	pizza.name = "자바피자"; //객체.필드(변수)=값
	double area = pizza.getArea(); // 변수=객체.메서드()
	System.out.println(pizza.name + "의 면적은 "+ area);
	
	Circle donut = new Circle();
	donut.radius = 2;
	donut.name = "자바도넛";
	area = donut.getArea();
	System.out.println(donut.name + "의 면적은 "+ area);
	
	Circle burger = new Circle();
	burger.radius = 4;
	burger.name = "자바버거";
	area = burger.getArea();
	System.out.println(burger.name + "의 면적은 "+ area);
	
	Rectangle rect = new Rectangle();
	rect.width = 4;
	rect.height = 5;
	int area1 = rect.getArea();
	System.out.println("사각형의 면적은 " + area1);
	
	//매개변수가 있는 생성자를 통해 객체 생성
	Circle test = new Circle(10, "테스트");
	area = test.getArea();
	System.out.println(test.name + "의 면적은 "+ area);
		
	//Rectangle 클래스에 매개변수 생성자 만들기
	//객체 생성 하나 하기
	Rectangle test1 = new Rectangle(20, 30);
	area1 = test1.getArea();
	System.out.println("test1의 면적은 " + area1);
	
	Book javaBook = new Book("java", "황기태");
	Book bible = new Book("Bible");
	Book emptyBook = new Book();
	
	javaBook.show();
	bible.show();
	emptyBook.show();

	}	
	
}
