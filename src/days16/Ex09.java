package days16;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Vector;

public class Ex09 {
	public static void main(String[] args) {
		//	[인터페이스의 장점]
		/*
		 * 1. 개발시간 단축 
		 * 		인터페이스 작성 + 사용하는곳 > 개발 진행
		 * 		인터페이스를 구현한 클래스가 없어도 개발 가능
		 * ex) has -a관계 :car, engine 클래스
		 * 		car클래스 코딩
		 * 			ㄴ Engine클래스 구현 x
		 * Engine 인터페이스 구현 클래스 - H_Engine, K_engine
		 */
		//[1]
		//인터페이스 매개변수 다형성
		/*
		//Engine engine = new K_Engine2();
		Engine engine = new H_Engine2();
		Car myCar = new Car(engine);
		*/
		
		//2. 표준화 가능
		/* Engine 인터페이스 구현해서 클래스를 만들었다면
		 * 그 클래스는 표준화되어져 있음
		 */
		
		//3. 서로 관련없는 클래스를 인터페이스로 관계맺을 수 있음
		// 		ㄴ 상속관계가 아닌 클래스
		
		/*
		//public class ArrayList<E> extends AbstractList<E>
        //implements List<E>, RandomAccess, Cloneable, java.io.Serializable
		List l = new ArrayList();
		
		//public class Vector<E>
	    //extends xxxList<E>
	    //implements List<E>, RandomAccess, Cloneable, java.io.Serializable
		List v = new Vector();
		// ㄴ 서로 상속관계가 아니더라도 interface만 같으면 관계를 맺을 수 있음
		
		test03(l);
		test03(v);
		*/
		
		//4. 독립적인 프로그래밍이 가능
		//		선언+구현
		
	}//main
	public void test03 ( List list) {
	
	}
}//class
