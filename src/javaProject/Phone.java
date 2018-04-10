//생성자 함수 만드는 법
//
//마우스 오른쪽 -> source -> generate constructor using field
//
//getter/setter 메서드 만드는법
//
//마우스 오른쪽 -> source -> generate getter and setter

package javaProject;

public class Phone {
	private String name, tel;
	//필드 ( 멤버 변수)
	
	public Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	
	//getter /setter 메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

}
