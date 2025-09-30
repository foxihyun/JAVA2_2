package ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x =-100;
		x = -x;
		System.out.println("x: " + x);
		
		byte b =100;
		int y = -b;
		// byte result = -b; 컴파일 에러 발생. 정수타입의 연산은 int이다
		System.out.println("y: " + y);
	}

}
