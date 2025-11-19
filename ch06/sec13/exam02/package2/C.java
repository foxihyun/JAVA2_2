package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.*;

public class A {
	A a1 = new A(true); // O 
	A a2 = A(1); // X DEFAULT 생성자 접근 불가
	A a3 = new A("문자열"); // X PRIVATE 생성자 접근 불가
}
