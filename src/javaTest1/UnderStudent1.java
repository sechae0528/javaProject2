package javaTest1;

public class UnderStudent1 extends Student1 {
	//��ӿ����� ������ �ش��ϴ� ���� ����
	//����� �θ𲨵� ���� ��� ����
	private String clubName;

	//������ �ʿ� ==> �Ű����� ���� ��, �Ű����� 1��==>
	public UnderStudent1() {
		super();		
	}

	public UnderStudent1(String clubName) {
		super();
		this.clubName = clubName;
	}
	public UnderStudent1(String name, int assignmentScore, 
							int examScore,String clubName) {
		super(name, assignmentScore, examScore); //�θ�Ŭ������ ������ ȣ��
		this.clubName = clubName;
	}

	//setter/getter �޼���
	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	
	//toString
	public String toString(){
		return super.toString() + "���Ƹ� �̸�: " + getClubName();
	}
	
	
	
	//toString

}
