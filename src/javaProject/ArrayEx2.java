package javaProject;

public class ArrayEx2 {

	public static void main(String[] args) {
		//2차원 배열 ==> 배열안에 또다른 배열
		//행, 열로 구성
		//일단 배열을 선언하면
		//배열변수는 행의 위치를
		//행은 다시 열의 시작 위치를 가리킴
		//실제 저장된 곳의 값을 찾아갈 때에는 [행]과 열로 찾아감
		
		//2차원 배열 선언
		int score[][] = new int[2][3]; //2X3의 2차원배열
		//2차원 배열의 접근해서 값 저장
		score[0][0] = 50; //첫번째 행에 첫번째 열
		score[0][1] = 30;
		score[0][2] = 40;
		score[1][0] = 30; //두번째 행에 첫번째 열
		score[1][1] = 40;
		score[1][2] = 60;
		//int score[][]={{50,30,40},{30,40,60}};
		
		//배열에 값 출력
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length; j++){
				System.out.println(score[i][j]);
			}
		}//i=0, j=0 ==> score[0][0]
		 //i=0, j=1 ==> score[0][1]
		 //i=0, j=2 ==> score[0][2];
		 //i=1, j=0 ==> score[1][0]
		
		//2치원배열로 합계, 평균구하기
		
		int score1[][] = {{3,4},{4,4},{4,3},{2,3}};
		//4X2 2차원배열
		int sum = 0;
		double avg = 0.0;
		for(int i1=0; i1<score1.length; i1++){ 
			for(int j1=0; j1<score1[i1].length; j1++){
				sum+=score1[i1][j1];
				
			}
		}
		int n=score1.length; //행의 갯수
		int m=score1[0].length; //열의 갯수
		avg = sum/(n*m);
		System.out.println("합계: "+sum + " 평균: " +avg);
		
		
		
	}

}
