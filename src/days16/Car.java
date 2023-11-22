package days16;

public class Car {
	//필드
	String name;
	String gearType; //수동, 자동
	int door;
	//엔진(구동장치)필요
	private Engine engine = null;
	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	Car(){}
	
	public Car (Engine engine) {
		this.engine = engine;
	}
	
	//메서드
	void speedUp(int fuel) {
		this.engine.moreFuel(fuel);
	}
	void speedDown(int fuel) {
		this.engine.lessFuel(fuel);
	}
	void stop() {
		this.engine.stop();
	}

}//car
