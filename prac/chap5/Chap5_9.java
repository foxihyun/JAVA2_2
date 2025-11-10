package prac.chap5;

import java.util.Scanner;

public class Chap5_9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int student = 0;
		int[] array = null;
		while(true)
		{
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트| 4.분석 | 5. 종료");
			System.out.println("--------------------------------------------");
			System.out.printf("선택>");
			int sel = scanner.nextInt();
			
			if(sel == 1)
			{
				System.out.printf("학생수>" );
				student = scanner.nextInt();
				//int RealArray = new array[student]; //힙 영역에 접근하기 때문에 소멸하지 않나요? 변수는 스택에 들어가서 if문 나가면 스택에서 빠져나가는거아닌가?
				array = new int[student]; //이게 정답 . 배열 객체를 힙에 생성하고 바깥 변수에 연결
			}
			
			else if(sel == 2)
			{
				
				for(int i=0;i<array.length;i++)
				{
					System.out.printf("score[%d]:",i);
					int score = scanner.nextInt();
					array[i] = score; // 점수 입력
				}
			}
			
			else if(sel == 3)
			{
				for(int i = 0; i<array.length;i++)
				{
					System.out.printf("score[%d]: %d\n",i, array[i]);				
					
				}
				
			}
			
			else if(sel == 4)
			{
				int max = array[0];//일단 선언 선언 주의해줘야함!!
				int total = 0; //총 점수도 선언
				for(int i=0;i<array.length;i++)
				{
					total += array[i];// 다 더한 값 선언
					if(max<=array[i]) max = array[i]; //최대 점수 설정
					
				}
				double average= (double) total/student;
				System.out.printf("최고 점수:%d\n",max);
				System.out.printf("평균 점수:%.1f\n",average); //표기법 주의
			}
			
			else if(sel == 5)
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
