package javaTest1;

public class StudentMain1 {

	public static void main(String[] args) {
		// setter �޼��带 ���ؼ� ��ü�� ����
		Student1 std3 = new Student1();
		std3.setName("ä����");
		std3.setAssignmentScore(99);
		std3.setExamScore(88);
		System.out.println(std3);
		
		//�����ڸ� ���ؼ� ��ü ����
		Student1 std4 = new Student1("ȫ�浿", 99, 33);
		System.out.println(std4);
		

	}

}
