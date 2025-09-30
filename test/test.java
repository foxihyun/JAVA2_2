package test;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1000000;
		int y = 1000000;
		int z = x*y; // z는 -727379968 오류 발생
		
		System.out.println(z);
		
		System.out.println("---------------------");
		
		long x1 = 1000000;
		long x2 = 1000000;
		long z1 = (long)x*(long)y;//long 빼면 오류 (int로 계산되기 떄문에
		
		System.out.println(z1);
	}

}
