package days14;

public class Engine {
	
	//필드
	int speed;
	
	//생성자
	//메서드
	void moreFuel(int fuel) {//연료 추가로 스피드up
		this.speed += fuel * 0.05; 
	}
	void lessFuel(int fuel) {//스피드down
		this.speed -= fuel * 0.05; 
	}
	void stop() {
		this.speed=0;
	}
}
