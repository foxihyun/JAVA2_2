package prac.chap4;

public class Chap4_4 {

	public static void main(String[] args) {

		while(true)
		{
			int num1 = (int)(Math.random()*6)+1; //math ran-> 0.0<=x <1.0
			int num2 = (int)(Math.random()*6)+1;
			int sum = num1+num2;
			System.out.printf("(%d,%d)\n",num1,num2);
			if(sum ==5) break; //합이 5면 종료			
		}
	}

}
