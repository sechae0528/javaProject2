package javaProject;

public class ArrayEx2 {

	public static void main(String[] args) {
		//2���� �迭 ==> �迭�ȿ� �Ǵٸ� �迭
		//��, ���� ����
		//�ϴ� �迭�� �����ϸ�
		//�迭������ ���� ��ġ��
		//���� �ٽ� ���� ���� ��ġ�� ����Ŵ
		//���� ����� ���� ���� ã�ư� ������ [��]�� ���� ã�ư�
		
		//2���� �迭 ����
		int score[][] = new int[2][3]; //2X3�� 2�����迭
		//2���� �迭�� �����ؼ� �� ����
		score[0][0] = 50; //ù��° �࿡ ù��° ��
		score[0][1] = 30;
		score[0][2] = 40;
		score[1][0] = 30; //�ι�° �࿡ ù��° ��
		score[1][1] = 40;
		score[1][2] = 60;
		//int score[][]={{50,30,40},{30,40,60}};
		
		//�迭�� �� ���
		for(int i=0; i<score.length; i++){
			for(int j=0; j<score[i].length; j++){
				System.out.println(score[i][j]);
			}
		}//i=0, j=0 ==> score[0][0]
		 //i=0, j=1 ==> score[0][1]
		 //i=0, j=2 ==> score[0][2];
		 //i=1, j=0 ==> score[1][0]
		
		//2ġ���迭�� �հ�, ��ձ��ϱ�
		
		int score1[][] = {{3,4},{4,4},{4,3},{2,3}};
		//4X2 2�����迭
		int sum = 0;
		double avg = 0.0;
		for(int i1=0; i1<score1.length; i1++){ 
			for(int j1=0; j1<score1[i1].length; j1++){
				sum+=score1[i1][j1];
				
			}
		}
		int n=score1.length; //���� ����
		int m=score1[0].length; //���� ����
		avg = sum/(n*m);
		System.out.println("�հ�: "+sum + " ���: " +avg);
		
		
		
	}

}
