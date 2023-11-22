package days19;

public class Ex05 {
	public static void main(String[] args) {
		// [Math클래스]
		//수학관련된 static 메서드
		System.out.println(Math.random());
		System.out.println(Math.max(2,4));
		System.out.println(Math.min(2,4));
		System.out.println(Math.pow(2,3)); //제곱
		System.out.println(Math.abs(-100)); //절대값
		System.out.println(Math.sqrt(4)); //루트값
		
		//올림(절상), 내림(절삭), 반올림
		//올림(절상) : 소수점 첫번째자리에서 올림 double
		System.out.println(Math.ceil(2.0)); //2.0 double
		System.out.println(Math.ceil(2.179)); //3.0 double
		System.out.println(Math.ceil(2.579)); //3.0 double
		System.out.println(Math.ceil(2.979)); //3.0 double
		//내림(절삭) : 소수점 첫번째자리에서 내림 double
		System.out.println(Math.floor(2.179)); //2.0 double
		System.out.println(Math.floor(2.579)); //2.0 double
		System.out.println(Math.floor(2.979)); //2.0 double
		//반올림 int
		System.out.println(Math.round(2.179)); //2 int
		System.out.println(Math.round(2.579)); //3 int
		System.out.println(Math.round(2.979)); //3 int
		//static 필드 2개
		System.out.println(Math.PI);
		System.out.println(Math.E);
		//Math클래스 : 최대성능을 얻기 위해 JVM이 설치된 OS의 메서드를 호출해서 처리
		//		  문제점 : os가 다르면 다른 결과값이 나올 수 있다.
		//StrictMath클래스 : 성능은 포기하더라도 os마다 동일한 결과값을 나오게 하기위해 사용
	}//main
}//class
