package javaProject;

public class Book {
	String title;
	String author;
	public void show(){System.out.println(title + " "+author);}
	
	//������
	public Book(){
		this("",""); //Book(string, string);������ ȣ��
		System.out.println("������ ȣ���");
	}
	
	public Book(String title){
		this(title, "���ڹ̻�");
	}
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}

}
