package days13;

public class Tv{
	/*중첩클래스  :public,default,private,protected 사용 가능
	class box{
	*/
//Illegal modifier for the class Tv; only public, abstract & final are permitted
//잘못된 수정자
//private class Tv {
	
	//멤버
	//멤버변수 (필드) ( 매서드에 선언 )
	//  ㄴ 초기화하지 않으면 각 자료형의 기본값으로 초기화됨
	/*
	public String color= null;
	public boolean power = false;
	public int channel=0;
	 */
	// 선언형식 : [접근지정자][기타제어자]자료형 필드명 [=초기화];
	
	public String color;
	public boolean power;
	public int channel;
	//멤버함수(매서드)
	public void power() {
	//==public void poweronoff (){
		power = ! power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
}//class
