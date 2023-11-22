package days19;

import java.util.Objects;
import java.util.Random;

public class Ex08 {
	public static void main(String[] args) {
		//Arrays클래스 배열을 다룰 때 사용되는 기능이 있는 클래스
		//]Objects클래스] 객체를 다룰 떄 사용되는 기능이 있는 클래스
		Ex08 obj = null;
		//if(obj !=null) 
		//if(!Objects.isNull(obj))
		//if(!Objects.nonNull(obj))

		//Objects.isNull(obj)   
		//inNull() : obj객체가 null일 때 true 반환 메서드
		//nonNull() : obj객체가 null이 아닐 때 true 반환 메서드
		/*
		if(obj ==null) {
			new ~~Exception ("예외메세지");
		}
		this.name=name;
		*/		
		//this.name = Objects.requireNonNull(name, "예외메세지");
	
		//if (a!=null && a.equals(b)) {}
		//if (Objects.equals(a, b)) {}

		//java.util.Random클래스
		Random rnd = new Random();
		//rnd.nextBoolean(); //true, false
		//rnd.nextInt(bound); //0<=정수 <bound
		//rnd.nextxxxx();
	}//main
}//class
