package javaProject;





public class Circle {
	public int radius; //�ʵ�(=�������)
	public String name; //�ʵ�
	//�ʵ� : circleŬ������ ������ Ư¡
	// ==> �� �ʵ带 �̿��ؼ� �޼ҵ忡�� �۾�(���Һο�)
	
	//�⺻������ ==>  Ŭ���� �̸�
		//������ Ŭ�����̸�()...
	public Circle(){
			
	}
		
	//�Ű������� �ִ� ������
	public Circle(int r, String n){
		radius = r; //Ŭ���� �ʵ�=���޵Ǵ� ��
		name = n;
	}
	
	
	//�޼ҵ� => ���Һο�
	//������ ����Ÿ�� �޼����̸�(.. ) { }
	public double getArea(){
		return 3.14*radius*radius;
		//3.14*this.radius*this.radius
		//3.14*Circle.radious*Circle.radius
		
	
	}

	public static void main(String[] args) {
	//Circle Ŭ������ �ִ� ������ �޼��带 ������ ������
	Circle pizza; //Ŭ������ ������
	pizza = new Circle(); //��üƲ���� �� ����ϱ�(�ν��Ͻ�)
	pizza.radius = 10;
	pizza.name = "�ڹ�����"; //��ü.�ʵ�(����)=��
	double area = pizza.getArea(); // ����=��ü.�޼���()
	System.out.println(pizza.name + "�� ������ "+ area);
	
	Circle donut = new Circle();
	donut.radius = 2;
	donut.name = "�ڹٵ���";
	area = donut.getArea();
	System.out.println(donut.name + "�� ������ "+ area);
	
	Circle burger = new Circle();
	burger.radius = 4;
	burger.name = "�ڹٹ���";
	area = burger.getArea();
	System.out.println(burger.name + "�� ������ "+ area);
	
	Rectangle rect = new Rectangle();
	rect.width = 4;
	rect.height = 5;
	int area1 = rect.getArea();
	System.out.println("�簢���� ������ " + area1);
	
	//�Ű������� �ִ� �����ڸ� ���� ��ü ����
	Circle test = new Circle(10, "�׽�Ʈ");
	area = test.getArea();
	System.out.println(test.name + "�� ������ "+ area);
		
	//Rectangle Ŭ������ �Ű����� ������ �����
	//��ü ���� �ϳ� �ϱ�
	Rectangle test1 = new Rectangle(20, 30);
	area1 = test1.getArea();
	System.out.println("test1�� ������ " + area1);
	
	Book javaBook = new Book("java", "Ȳ����");
	Book bible = new Book("Bible");
	Book emptyBook = new Book();
	
	javaBook.show();
	bible.show();
	emptyBook.show();

	}	
	
}
