package days13;

public class Ex05 {
	public static void main(String[] args) {
		//[클래스배열]
		/*
		Tv tv1=new Tv();
		Tv tv2=new Tv();
		Tv tv3=new Tv();
		*/
		
		//배열선언형식
		//자료형 [] 배열명 = new 자료형[배열크기];
		Tv[] tvArr = new Tv[3];
		//		ㄴ배열명
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i]= new Tv();
		} //	for 객체생성
		
			
		//java.lang.NullPointerException
		//객체생성이 되지않음. 인스턴스화 x
		//===> tvArr[0] = new Tv() ;
		tvArr[0].power();
		System.out.println("Tv : " +(tvArr[0].power ? "ON" : "OFF"));
		tvArr[0].channelUp();
		System.out.println("현재 채널 :" +tvArr[0].channel);
		tvArr[0].power();
		System.out.println("Tv : " + (tvArr[0].power ? "ON" : "OFF"));
		System.out.println("end");
	}//main
}//class
