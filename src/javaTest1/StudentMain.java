package javaTest1;

public class StudentMain {

	public static void main(String[] args) {
		//Ŭ���� ����
		Student std1 = new Student();
		//Ŭ������ ��� ������ ���� ==> ��ü��.�������, ��ü��.�޼���()
		std1.name ="����";
		std1.assignmentScore = 91;
		std1.examScore=84;
		System.out.println(std1);
		
		Student std2 = new Student();
		std2.name ="����";
		std2.assignmentScore = 86;
		std2.examScore=95;
		System.out.println(std2.toString());
		
	}

}
