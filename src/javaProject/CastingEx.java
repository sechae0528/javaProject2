package javaProject;

//person Ŭ����
class Person {
	String name;
	String id;
	//name�Ű� ������ �ִ� ������
	public Person(String name) {
		this.name = name;
	}	
}
//student Ŭ���� (����)
class Student extends Person {
	String grade;
	String department;
	//������ �ڵ��ϼ��� �ȵ� ==> ������ �߰�
	public Student(String name){
		super(name); //����Ŭ������ ������ ȣ��
	}
	public String toString(){
		return "id�� " + id +" ������ " +  grade + " ���� " + department;
	}
}

public class CastingEx {
	public static void main(String[] args) {
		Person p = new Student("ä����");
		//p=s�� ������ ǥ�� (�� ĳ����)
		//������ ������ ����
		//���� = ���� (��ĳ����)
		//������ ������ ���� ����
		//����ȯ�� �ʿ�
		Student s = (Student)p;
		
		s.id="1234";
		s.grade = "A";
		s.department = "����Ʈ������";
		
		//��� ����ϱ�
		System.out.println("id�� " +s.id +" ������ " + s.grade + " ���� " + s.department);
		//Ŭ���� �ȿ� toString()�޼��带 ���� ����ϱ�
		System.out.println(s.toString());
		System.out.println(s);
	}
}

//�� ���� ǥ��
//System.out.println("id�� " +s.id +" ������ " + s.grade + " ���� " + s.department);		
//System.out.println(s.toString());
//System.out.println(s);
