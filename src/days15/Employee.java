package days15;

//		[사원클래스]
// 모든 사원들이 공통적으로 가져야할 멤버(필드, 메서드) 구현

/*
 * 추상메서드가 한개라도 있다면 불완전한 클래스이고
 * 객체를 생성할 수 없음
 * 추상클래스
 * abstract class
 */
//최상위 class =object
public abstract class Employee extends Object {
	
	//필드
	private String name;		//사원명
	private String addr;		//주소
	private String tel;			//연락처
	private String hiredate; //입사일자
	//생성자
	public Employee() {
		System.out.println(">Employee 디폴트생성자 호출됨");
	

		

	}
	public Employee(String name, String addr, String tel, String hiredate) {
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println(">Employee4 디폴트생성자 호출됨");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	
	//메서드
	//사원들의 정보출력
	public void dispEmpInfo() {
		System.out.printf("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s\n",this.name, this.addr, this.tel, this.hiredate);
	}
	@Override
	public String toString() {
		return 	String.format("사원명:%s, 주소:%s, 연락처:%s, 입사일자:%s",this.name, this.addr, this.tel, this.hiredate);

	}
	/*
	//기능은 없으나 자식클래스에서 오버라이딩해서 재정의사용가능하도록
	// ==가상메서드
	public int getPay() {
		return 0;
	}
	*/
	//This method requires a body instead of a semicolon
	//body{}몸체 구현안된 불완전한 메서드
	//추상메서드
	//기타제어자 abstract 키워드 붙임
	public abstract int getPay();
	
	
}	


