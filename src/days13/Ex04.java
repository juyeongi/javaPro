package days13;

public class Ex04 {
	public static void main(String[] args) {
		
		//[패키지 내부] -public
		//Tv클래스와 Ex04클래스 days13 package 안에 있다.
		Tv tv1 = new Tv();
		System.out.println(tv1.channel);
		
		//[패키지 외부] public 상속/참조 가능 테스트 days01.Ex06_Tvtest.java
		
		/*
		//[접근지정자]
		//1. 클래스 앞의 접근지정자
		 * public  : 패키지 내부, 외부 어디서든 상속/참조 가능
		 * default(생략)(==package)  : 패키지 내부에서만 상속/참조 가능
		 * 
		 * 독립적인 클래스로 선언할 때는 사용할 수 없는 접근지정자
		 *  ㄴ 중첩클래스로 선언할 때 사용
		 *  내부클래스 4가지 종류
		 * private  비활성  : 같은 파일 내에서만 상속/참조가능
		 * protected  비활성  :default+패키지 외부에서는 상속만 가능
		 * 
		 * 1-2. 클래스 앞의 기타제어자
		 * abstract  :추상클래스
		 * final  :최종클래스
		 * static 비활성 : 중첩클래스 선언할 때 사용가능
		 * 
		//2. 멤버(필드, 메서드)앞의 접근지정자
		 * public  
		 * default(생략)  
		 * private  
		 * protected  
		 */
		 
	}

}
