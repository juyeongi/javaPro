package days14;

public class Car {
	//필드
	String name;
	String gearType; //수동, 자동
	int door;
	//엔진(구동장치)필요
	private Engine engine = null;
	//Engine engine = new Engine(); //has-a  //1)명시적 초기화
	// ㄴ 결합력이 높은 코딩 : 전체를 다 사용 불가하게됨
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
/*--------------------------------------------	
	{
		2)인스턴스 초기화 블럭 
		this.engine = new Engine();
	}
---------------------------------------------*/
	//생성자 :default
	Car(){
//		this.engine = new Engine(); //3)생성자 초기화
	}
	
	public Car (Engine engine) {
		this.engine = engine;
	}
	
	//메서드
	void speedUp(int fuel) {
		//NullPointerException
		//Engine engine; 객체생성안됨 
		this.engine.moreFuel(fuel);
	}
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	void stop() {
		this.engine.stop();
	}

}//car
