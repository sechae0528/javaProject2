package javaProject;

import java.util.Scanner;

public class Phone1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸��� ��ȭ��ȣ �Է�>>");
		String name1 = scanner.next();
		String tel1 = scanner.next();
		Phone a = new Phone(name1, tel1);
		
		System.out.println(a.getName() + "�� ��ȣ " + a.getTel());

	}

}
