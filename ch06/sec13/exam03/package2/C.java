package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	public C() {
		//객체 생성
		A a = new A();
		
		a.field1 =1;
		a.field2 = 1; //default 필드 접근 불가
		a.field3 = 1; //private
		
		a.method1(); //o
		a.method2();
		a.method3();
	}
}
