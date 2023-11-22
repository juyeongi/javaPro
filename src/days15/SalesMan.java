package days15;
//영업직 사원 최종(마지막)클래스
//final class 자식클래스를 가질 수 없는 최종클래스
public final class SalesMan extends Regular {
	//필드 - name, addr,tel,hiredate,basepay
	//생성자상속x
	//메서드 -@dispEmpInfo(), @toString(), getPay()
	private int sales;
	private int comm;
	//fields
	public SalesMan(int sales, int comm) {//디폴트생성자
		super();
		System.out.println(">SalesMan디폴트생성자 호출됨");
	}
	//superclass
	public SalesMan() {
		super();

	}
	public SalesMan(String name, String addr, String tel, String hiredate, int basePay, int sales, int comm) {
		super(name, addr, tel, hiredate, basePay);
		this.sales=sales;
		this.comm=comm;
		System.out.println(">SalesMan7생성자 호출됨");
		
	}
	
	//재정의 (기본급 출력)
	@Override
	public void dispEmpInfo() {
		/*
		super.dispEmpInfo();		//부모의 멤버들을 가리킬때의 super 
		System.out.printf(", 기본급: %d\n", this.basePay); //기본급 추가
		*/
		
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s, 기본급: %d, 판매량:%d, 커미션:%d\n"
				, this.getName(), this.getAddr(), this.getTel(),this.getHiredate(),this.getBasePay(), this.sales,this.comm);
		
	}

	//월급계산
	@Override
	public int getPay() {
		return super.getPay()+this.sales*this.comm;
	}
	
	
	
}//class
//The type Child cannot subclass the final class SalesMan
// 최종클래스는 자식클래스 가질 수 없음
//class Child extends SalesMan