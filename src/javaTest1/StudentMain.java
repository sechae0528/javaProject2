package javaTest1;

public class StudentMain {

	public static void main(String[] args) {
		//클래스 선언
		Student std1 = new Student();
		//클래스의 멤버 변수에 접근 ==> 객체명.멤버변수, 객체명.메서드()
		std1.name ="선남";
		std1.assignmentScore = 91;
		std1.examScore=84;
		System.out.println(std1);
		
		Student std2 = new Student();
		std2.name ="선녀";
		std2.assignmentScore = 86;
		std2.examScore=95;
		System.out.println(std2.toString());
		
	}

}
