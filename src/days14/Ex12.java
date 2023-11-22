package days14;

public class Ex12 {
	public static void main(String[] args) {
		/*
		
		 * [클래스들간의 관계]
		 * 1. has-a 관계 ***
		 * 		2개의 클래스 선언
		 * 		Car 클래스 - 	Engine 클래스 - 연료, 구동장치
		 * 							ㄴ 클래스객체
		 * 		Car has-a Engine
		 *
		 * 2. is-a 관계 (상속)
		*/
		
		Engine engine = new Engine();
		
		// DI 2가지 방법
		//1)생성자 통해서 DI 외부(다른 클래스)에서 만들어서 객체를 넣어줌 
		//Car myCar=new Car();  //의존성주입 (DI)
		//2)setter 통해서 DI
		
		Car myCar = new Car();
		myCar.setEngine(engine);
		
		myCar.speedUp(100);
		int carSpeed = myCar.getEngine().speed;
		System.out.println(carSpeed);
		
		myCar.speedDown(10);
		carSpeed = myCar.getEngine().speed;
		System.out.println(carSpeed);
		
		myCar.stop();
		carSpeed = myCar.getEngine().speed;
		System.out.println(carSpeed);
		
		System.out.println("end");

	}//main
}//class
