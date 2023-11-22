package days14;
//days14.Ex07
//저축 관련 클래스
public class Save {
	//필드
	private String name = null; // 예금주 	
	private int money=0; // 예금액
	/*
	 * 1) 인스턴스가 생성될 때 마다 필드가 생성되지 않는다
	 * 2) 클래스가 선언될 때 Method(메모리)영역에 필드 생성
	 *   (객체를 생성하지 않아도 static 필드는 생성되어져 있음)
	 *3) 모든 인스턴스(객체)가 공유하는 필드
	 *		공유변수, shared 변수, static변수, 정적변수, 클래스변수
	 */
	private static double rate=0.04; // 이자율
	//생성자 default
	public Save() {}
	//alt+shift+s
	public Save(String name, int money, double rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}
	//alt+shift+s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	/*
	객체가 생성되어야 사용할 수 있는 인스턴스 메서드
	public double getRate() {
		return rate;
	}
	*/
	//static 메서드, 정적 메서드
	public static double getRate() {
		return rate;
	}
	
	//Cannot use this in a static context
	//static 안에서 this 사용 x
	// this 객체 생성되어야 사용가능. <-> static
	//this.rate = rate;
	public static void setRate(double rate) {
		//지역변수 사용가능
		int n =10;
		
		//this.rate = rate;//인스턴스 변수 사용x
		//Cannot make a static reference to the non-static field name
		//name = "홍길동";
		
		//static 클래스명.메서드
		//The assignment to variable rate has no effect
		//할당 효과 없음
		//this.rate = rate;
		Save.rate = rate;
	}
	
	//메서드 - 예금 정보 출력
	public void dispSave() {
		System.out.printf(">예금주 : %s, 예금액 : %d,이자율 : %.2f\n"
				,this.name , this.money, this.rate);
	}

}//필드
