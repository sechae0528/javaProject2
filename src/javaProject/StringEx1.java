package javaProject;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		//문자열은 ==> 배열처럼 인덱스 번호를 가지면서 저장
		String a="Hello";
		String b = new String("java"); //둘다 같은 방법
		
		System.out.println("단어a: " +a);
		System.out.println("a의 문자갯수: " +a.length());
		System.out.println("a의 0번부터 2번전까지의 문자: " +a.substring(0,2));
		System.out.println("a의 3번째문자: " +a.charAt(3));
		String s[] =a.split(","); //문자열을 ,로 구분해서 배열에 저장
		
		for(int i=0; i<s.length; i++){
			System.out.println(s[i]);
		}
		
		//문자열 + 배열을 활용한 영문을 입력하면 한글로 변경
		String eng[] = {"student", "love", "java", "happy","future"};
		String kor[] = {"학생","사랑","자바","행복","미래"};
		
		//사용자로부터 입력받아서 사용
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.print("영어단어를 입력하세요>> ");
			String s1=scanner.nextLine();
			if(s1.equals("exit")){
				System.out.println("종료되었습니다.");
				break; //s1(내가 입력한 문자)가 exit라면 중단
			}
			for(int i1=0; i1<eng.length; i1++){
				//배열 길이 만큼 반복
				if(eng[i1].equals(s1)){
					//배열에 저장된 값과 내가 입력한 값이 같으면
					System.out.println(kor[i1]);
					break;
				}
			}
			
		}
		
		//사용자로부터 입력받은 하나의 문자를 비교하기
		char ch = ' ';
		System.out.printf("문자를 하나 입력하세요>>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);

		
		if('0'<= ch && ch <='9'){
			System.out.printf("입력하신 문자는 숫자입니다.\n");
		}
		if(('a'<=ch && ch <= 'z') || ('A'<=ch && ch <='Z')){
			System.out.printf("입력하신 문자는 영문자입니다.\n");
		}
		
		
		//대소문자 전환하기
		char ch1 = ' ';
		System.out.printf("영문자를 입력하세요>>");
		
		String input1 = scanner.nextLine();
		ch1 = input1.charAt(0);
		
		//toUpperCase() : 모든 문자에 대해서 소문자를 대문자로 바로 변환
				System.out.println("소문자=>대문자 "+input1.toUpperCase()); 
				//toLowerCase() : 모든 문자에 대해서 대문자를 소문자로 바로 변환
				System.out.println("대문자=>소문자 "+input1.toLowerCase());
				
				if('a'<=ch1 && ch1 <= 'z'){
					ch1 = (char)(ch1-32); //대문자를 소문자로 바꿔줌. 문자의 크기만큼 숫자로 빼준다음 다시 char로 형태전환
				}else if ('A'<=ch1 && ch1 <='Z'){
					ch1 = (char)(ch1+32); //소문자를 대문자로 전환
				}
				System.out.println("첫글자만 대소문자 변환: "+ch1);

	}

}
