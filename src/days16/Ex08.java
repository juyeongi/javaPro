package days16;

public class Ex08 {
	public static void main(String[] args) {
	}//main
}//class

//java : ~~~able  인터페이스 
interface Movable{
	/*
	 * 상수
	 * 추상메서드
	 * dafault
	 * static
	 */
	void move(int x, int y);  //public abstract 생략
	
}
interface Attackable{
	void attack(Unit unit);
}

//인터페이스끼리 단일, 다중상속 가능
interface Fightable extends Attackable, Movable{
	//추상메서드 
}

abstract class Unit{
	int currentHP; //현재유닛의 체력
	int x;	//유닛의 위치(x좌표)
	int y;	//유닛의 위치(y좌표)		
}
//하늘유닛
class AirUnit extends Unit{	
}

//땅유닛
class GroundUnit extends Unit{	
}

class Fighter implements Fightable { //move() , attack () 

	@Override
	public void move(int x, int y) {
		//걷기	
	}
	@Override
	public void attack(Unit unit) {
		//총, 칼, 공격...
	}
}
//수리 가능한 유닛
interface Repairable{} //상수,메서드 등 아무것도 없음
//scv가 수리가 가능한 객체인지 판단

class Tank extends GroundUnit implements Fightable, Repairable{

	@Override
	public void move(int x, int y) {
		//탱크의 움직임	
	}
	@Override
	public void attack(Unit unit) {
		//포쏘는공격
	}
}
//scv
//수리 : Repairable 인터페이스를 구현한 클래스. (Tank, SCV)
//수리 불가능 : (Fighter)

class SCV extends GroundUnit implements Repairable{
	SCV(){}
	//건물 짓기 메서드
	// 다른 유닛 수리 메서드
	void repair (Repairable unit) {
	//						ㄴ 다형성
		if (unit instanceof Tank) {
			//tank 수리코딩
		}else if (unit instanceof SCV) {
			//scv 수리코딩
		}else if (unit instanceof  DropShip) {
			//DropShip 수리코딩
		}
	}
}
	
//탱크, 군인,무기 등등 수송선
class DropShip extends AirUnit implements Fightable, Repairable{
//																	ㄴ	move() , attack () 			
	@Override
	public void attack(Unit unit) {
	}
	@Override
	public void move(int x, int y) {
	}	
}

class Marine extends Unit implements Fightable{

	@Override
	public void move(int x, int y) {
	}

	@Override
	public void attack(Unit unit) {
	}
	
}