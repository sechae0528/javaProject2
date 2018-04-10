package javaProject;

//person 클래스
class Person {
	String name;
	String id;
	//name매개 변수만 있는 생성자
	public Person(String name) {
		this.name = name;
	}	
}
//student 클래스 (하위)
class Student extends Person {
	String grade;
	String department;
	//생성자 자동완성이 안됨 ==> 별도로 추가
	public Student(String name){
		super(name); //상위클래스의 생성자 호출
	}
	public String toString(){
		return "id는 " + id +" 성적은 " +  grade + " 과는 " + department;
	}
}

public class CastingEx {
	public static void main(String[] args) {
		Person p = new Student("채성은");
		//p=s와 동일한 표현 (업 캐스팅)
		//하위를 상위에 대입
		//상위 = 하위 (업캐스팅)
		//상위는 하위에 접근 오류
		//형변환이 필요
		Student s = (Student)p;
		
		s.id="1234";
		s.grade = "A";
		s.department = "스마트금융과";
		
		//결과 출력하기
		System.out.println("id는 " +s.id +" 성적은 " + s.grade + " 과는 " + s.department);
		//클래스 안에 toString()메서드를 만들어서 출력하기
		System.out.println(s.toString());
		System.out.println(s);
	}
}

//다 같은 표현
//System.out.println("id는 " +s.id +" 성적은 " + s.grade + " 과는 " + s.department);		
//System.out.println(s.toString());
//System.out.println(s);
