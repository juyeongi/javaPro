package days16;
// new class - interface engine 추가
public class H_Engine implements Engine {
	int speed;

	@Override
	public void moreFuel(int fuel) {
		this.speed+=fuel*0.10;
	}

	@Override
	public void lessFuel(int fuel) {
		this.speed-=fuel*0.10;
	}

	@Override
	public void stop() {
		this.speed=0;
	}

}
