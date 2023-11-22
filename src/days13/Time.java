package days13;

		// 멤버 + [접근지정자] 설명
		//시간 + 속성, 기능을 구현한 클래스 
public class Time {
	//필드 선언
	public int hour;
	int minute;
	protected int second;
	private int milisecond; // 10000ms ==1초
	public int nano;  //  1/10^9==1ns
	
	//매서드 선언
	public void printTime() {
		milisecond = 100; //private는 같은 클래스 안에서만 접근 가능 
	}
}
