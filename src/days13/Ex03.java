package days13;

public class Ex03 {
	public static void main(String[] args) {
		//1. Tv클래스 선언 = Tv.java
		//2. Tv객체생성
		
		Tv tv1= null;
		tv1= new Tv(); 
		
		//클래스 사용시 가장 많이 발생
		// java.lang.NullPointerException
		// 객체생성이 되지 않아서
		////인스턴스:color,power,channel,power(),channelUp(),channelDown()
		                                            // 매서드
		//        멤버를 가리킬때   **
		//객체명.필드명
		//객체명.매서드명();
		tv1.power();
		System.out.println("Tv : " +(tv1.power ? "ON" : "OFF"));
		tv1.channelUp();
		System.out.println("현재 채널 :" +tv1.channel);
		tv1.channelDown();
		tv1.power();
		System.out.println("Tv : " + (tv1.power ? "ON" : "OFF"));
		System.out.println("end");
	}//main
}//class
