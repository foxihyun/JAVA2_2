package ch06.sec13.exam03.package1;

public class A {
	
	public int field1;
	
	int field2; //default
	
	private int field3; //private 
	
	public A() {
		field1 = 1; // O
		field2 = 1;//O
		field3 = 1;//O
		
		method1();//O
		method2();//O
		method3(); //O
	} //위의 6개 모두 클래스 내부이기 떄문에 접근 제한자의 영향을 받지 않는다
	
	public void method1() {
		
	}
	
	void method2() {
		
	}
	
	private void method3() {
		
	}
}
