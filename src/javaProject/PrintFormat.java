package javaProject;



public class PrintFormat {

    public static void main(String[] args){

        int i = 97;
        String s="java";
        double f=3.14f;

        System.out.printf("정수출력 : %d\n", i); //10진수 정수출력
        System.out.printf("정수출력 : [%10d]\n", i); //10자리
        System.out.printf("문자출력 : %s\n", s); //문자열 출력
        System.out.printf("문자출력 : [%10s]\n", s); //10자리
        System.out.printf("실수출력 : [%5.1f]\n", f ); //다섯자리에 소숫점 한자리

    }
}
