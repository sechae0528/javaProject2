package javaProject;

import java.util.Scanner;

public class Phone1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름과 전화번호 입력>>");
		String name1 = scanner.next();
		String tel1 = scanner.next();
		Phone a = new Phone(name1, tel1);
		
		System.out.println(a.getName() + "의 번호 " + a.getTel());

	}

}
