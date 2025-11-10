package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator myCalc = new Calculator();
		
		//리턴값 없는 poweron메소드 호출
		myCalc.powerOn();
		
		//plus메소드 호출 시 5,6 매개값 제공, 덧셈 결과 리턴 받아 result1에 대입
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: "+ result1);
		
		int x=10;
		int y = 4;
		//divide메소드 호출 시 xy값 매개값 제공, 나눗셈 결과 리턴 받아 result2 대입
		double result2=myCalc.divide(x, y);
		System.out.println("result2: "+result2);
		
		myCalc.powerOff();
	}

}
