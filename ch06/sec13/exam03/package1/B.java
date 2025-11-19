package ch06.sec13.exam03.package1;

public class B {
	A a = new A();
	
	//필드값 변경
	a.field1 = 1;//o
	a.field2 = 1;//o
	a.field3 = 1; //x ->private 필드 접근 불가

	a.method1();//O
	a.method2();//O
	a.method3(); //X ->private 접근 불가
}
