package javaTest1;

public class Student1 {
	//멤버 변수들 ==> 멤버변수(=필드) + 생성자 + 메서드로 구성
	private String name;
	private int assignmentScore; 
	private int examScore; //외부에 접근 못함
	
	//생성자 => 매개변수가 없는 기본 생성자1개 매개변수 3개
	public Student1() {
		super();
	}
	
	public Student1(String name, int assignmentScore, int examScore) {
		super();
		this.name = name;
		this.assignmentScore = assignmentScore;
		this.examScore = examScore;
	}

	
	
	//setter/getter
	public String getName() {
		return name;
	}	

	public void setName(String name) {
		this.name = name;
	}

	public int getAssignmentScore() {
		return assignmentScore;
	}

	public void setAssignmentScore(int assignmentScore) {
		this.assignmentScore = assignmentScore;
	}

	public int getExamScore() {
		return examScore;
	}

	public void setExamScore(int examScore) {
		this.examScore = examScore;
	}
	
	//성적 처리 메서드
	public char getGrade() {
		char letterGrade= ' ';
		double total;
		total = assignmentScore *0.4 + examScore*0.6;
		if (total>=90){
			letterGrade ='A';
		}else if (total >= 80){
			letterGrade = 'B';
		}else if (total >= 70){
			letterGrade = 'C';
		}else if (total >= 60){
			letterGrade = 'D';
		}else {
			letterGrade = 'F';
		}
		return letterGrade;
	}
	
	

	//결과물 출력하는 toString() 메서드
	public String toString(){
		String str = "";
		str += "이름: " + name + "\n";
		str += "과제 점수: " + assignmentScore + "\n";
		str += "시험 점수: " + examScore + "\n";
		str += "학점: " + getGrade() + "\n";
		return str;
	}

}
