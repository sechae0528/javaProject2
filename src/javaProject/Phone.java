//������ �Լ� ����� ��
//
//���콺 ������ -> source -> generate constructor using field
//
//getter/setter �޼��� ����¹�
//
//���콺 ������ -> source -> generate getter and setter

package javaProject;

public class Phone {
	private String name, tel;
	//�ʵ� ( ��� ����)
	
	public Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	
	//getter /setter �޼���
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
