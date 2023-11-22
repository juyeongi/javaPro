package days15;

public class Temp extends Employee {
	//필드 - name~ hiredate
	//생성자 x
	//aptjem - dispEmpInfo(), @toString(), getter, setter
	private int days; // 근무일수
	private int payOfDay; // 하루 일당
	
	public Temp(int days, int payOfDay) {
		super();

	}
	//생성자
	public Temp() {
		super();
		System.out.println("Temp 디폴트 생성자 호출됨");
	}

	public Temp(String name, String addr, String tel, String hiredate, int days, int payOfDay) {
		super(name, addr, tel, hiredate);
		this.days=days;
		this.payOfDay=payOfDay;
		System.out.println("Temp 6 생성자 호출됨");
	}
	
	//급여계산
	@Override // 컴파일러에서 재정의 확인해줌
	public int getPay() {
		return this.days * this.payOfDay;
	}
	
	//사원들의 정보출력
	@Override
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 근무일수: %d, 하루일당: %d\n"
				,this.getName(), this.getAddr(), this.getTel(), this.getHiredate(),this.days,this.payOfDay);
	}

	

}
