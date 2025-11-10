package prac.chap5;

public class Chap5_7 {

	public static void main(String[] args) {
		
		int[] array= {1,5,3,8,2};
		int Max = 0;
		for (int i =0 ; i<array.length;i++) {
			if(array[i]>=Max) Max =array[i];
		}
		System.out.println(Max);
		
	}

}
