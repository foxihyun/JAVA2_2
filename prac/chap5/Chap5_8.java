package prac.chap5;

public class Chap5_8 {

	public static void main(String[] args) {
		
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};// 배열 선언 완료/ 최대 3행5열
		int total = 0;
		int student = 0;
		for(int i=0;i<array.length;i++)// 3
		{
			
			for (int k=0; k<array[i].length;k++) //
			{
				total += array[i][k]; //전체합
				student++;
			}
								
		}
		
		double aver = (double) total / student;
		System.out.println("전체합:" + total);
		System.out.println("전체 평균:" + aver);	
	}

}
