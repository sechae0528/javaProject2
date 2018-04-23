package javaTest1;

public class UnderStudent1 extends Student1 {
	//상속에서는 내꺼에 해당하는 값만 정의
	//사용은 부모꺼도 같이 사용 가능
	private String clubName;

	//생성자 필요 ==> 매개변수 없는 것, 매개변수 1개==>
	public UnderStudent1() {
		super();		
	}

	public UnderStudent1(String clubName) {
		super();
		this.clubName = clubName;
	}
	public UnderStudent1(String name, int assignmentScore, 
							int examScore,String clubName) {
		super(name, assignmentScore, examScore); //부모클래스의 생성자 호출
		this.clubName = clubName;
	}

	//setter/getter 메서드
	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	//toString
	public String toString(){
		return super.toString() + "동아리 이름: " + getClubName();
	}
	
	
	
	//toString

}
