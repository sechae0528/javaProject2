package javaTest1;

public class UnderStudentMain1 {

	public static void main(String[] args) {
		// ����Ŭ���� ���� ==> ����Ŭ���� ���뵵 ���� ��� ����
		
		UnderStudent1 std5 = new UnderStudent1();
		std5.setName("ä����");
		std5.setClubName("���α׷���");
		System.out.println(std5);
		
		//����Ŭ���� ==> �����ڷ� ���ؼ� 
		UnderStudent1 std6 = new UnderStudent1("ȫ�浿", 10, 40, "����");
		System.out.println(std6);
	}

}
