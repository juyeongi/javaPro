package days15;

//		[정규직] 사원클래스
public class Regular extends Employee {
	//[object] 멤버들도 상속
	//[Employee]
	//필드		name, adrr, tel, hiredate
	//생성자 x
	//메서드 - dispEmpInfo(), @toString()
	private int basePay; //기본급
	//생성자
	
	public Regular() {
		super();
		System.out.println(">Regular 디폴트생성자 호출됨");
	}
	public Regular(String name, String addr, String tel, String hiredate, int basePay) {
		//The field Employee.name [is not visible] 접근지정자
		//Employee 접근지정자가 private이기 때문에 불러올 수 없음(클래스안에서만 참조)
		//this.name = name; x
		//this.setName(name); o
		//부모클래스Employee의 생성자 불러오기
		//super(); //Employee의 디폴트생성자 호출 
		//부모의 참조값을 가진 참조변수 super 
		super(name, addr, tel, hiredate); //부모에게서 상속된 필드 초기화
		this.basePay= basePay;
		System.out.println(">Regular5 디폴트생성자 호출됨");
		
	}
	
	//기본급getter setter
	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}
	
	//재정의 (기본급 출력)
	@Override
	public void dispEmpInfo() {
		/*
		super.dispEmpInfo();		//부모의 멤버들을 가리킬때의 super 
		System.out.printf(", 기본급: %d\n", this.basePay); //기본급 추가
		*/
		
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급: %d"
				, this.getName(), this.getAddr(), this.getTel(),this.getHiredate(),this.basePay);
		
	}
	@Override
	public String toString() {
		return super.toString() + String.format(", 기본급: %d\n",this.basePay);
	}
	
	//월급계산
	//정규직은 기본급만 받음
	public int getPay() {
		return this.basePay;
	}

}//class
