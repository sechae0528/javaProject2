package javaProject;


import java.util.Scanner; //키보드로부터 데이터 입력을 받을 때, 임포트 스캐너 사용

public class ScannerEx {

    public static void main(String[] args){

        //객체 생성
        //클래스 변수 = new 클래스();
        System.out.print("숫자를 두 개 입력>>");
       

 	Scanner in = new Scanner(System.in); //Scanner 객체 생성


        int x = in.nextInt(); //객체사용법 : 객체변수명.메소드();
        int y = in.nextInt();

        System.out.printf("%d * %d은 %d입니다.\n", x, y, x*y);

        System.out.println("이름과 나이를 입력하세요");
        String name = in.next();
        int age = in.nextInt();
        System.out.println("당신의 이름은 "+ name + ", 나이는 " + age + "입니다");



 //문제 : 직사각형의 가로 세로 값을 입력받아서 넓이를 구하는 실습

        System.out.println("직사각형의 가로를 입력하세요");
        int a = in.nextInt();

        System.out.println("직사각형의 세로를 입력하세요");
        int b = in.nextInt();

        System.out.printf("직사각형의 가로는 %d, 세로는 %d, 직사각형의 넓이는 %d 입니다.", a,b,a*b );




    }




}
