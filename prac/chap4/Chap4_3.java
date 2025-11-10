package prac.chap4;

public class Chap4_3 {

	public static void main(String[] args) {
		int total = 0;
		
		for(int i=1 ;i<= 100; i++)
		{
			if(i%3==0)
			{
				total += i;
			}
		}
		System.out.println(total);
		
	}

}
