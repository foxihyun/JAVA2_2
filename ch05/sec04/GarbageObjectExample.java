package ch05.sec04;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; //여행 객체 쓰레기됨
		
		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null; //자동차에 해당하는
		System.out.println("kind2:" + kind2);
 
	}

}
