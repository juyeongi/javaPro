package days18;

import java.util.Objects;

public class Ex03_02 {
	//  object override
	public static void main(String[] args) {
		//주민등록번호가 같으면 동일한 사람(객체Person)
		Person p1 = new Person("111", "홍길동");
		Person p2 = new Person("111", "홍길둥"); //obj instanceof Person
		//Person p2 =null;  //obj != null
		
		//3)object.toString () 출력형태 
		//days18.Person@be11
		//패키지명.클래스명@해시코드의16진수값
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.hashCode()); //48657
		System.out.println(p2.hashCode());
		
		//Object -> equals()메서드 오버라이딩
		//System.out.println(p1.equals(p2)); //false
	}
}
//Person 클래스의 객체가 복제(clone)이 되도록 코딩 (Ex06)

class Person implements Cloneable{
	//생성자 
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	}//생성자
	
	String rrn;
	String name;
	
	//[Object 클래스] + 메서드  ==>Object.toString()
	@Override
	public String toString() {
		//return "Person [rrn=" + rrn + ", name=" + name + "]";
		return String.format("Person [rrn=%s, name=%s]", this.rrn, this.name);
	}
	
	//[Object 클래스] + 메서드 ==> Object.equals()
	//주민번호만 같으면 equals 오버라이딩
	// p1.equals(p2) 업캐스팅, 매개변수 다형성
	// Person만 가지는 equals 오버라이딩
	@Override //오버라이딩 어노테이션 
	public boolean equals(Object obj) {

		//object instanceOf Object는 항상 true를 리턴
		//object가 null이라면 instanceOf는 항상 false를 리턴
		if (obj != null && obj instanceof Person) { //instanceof연산자=객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인
			Person p = (Person)obj ; //다운캐스팅
			return this.rrn.equals(p.rrn);
		}
		return false;
	}	
	//[Object 클래스] + 메서드 ==> Object.hastCode()
	//rrn이 같으면 해시코드도 오버라이딩
	@Override
	public int hashCode() {
		return this.rrn.hashCode();
	}

	//[1]	
	/*
	@Override
	protected Object clone() throws
	CloneNotSupportedException{
		// return super.clone();
		
		Object obj= null;
		obj=super.clone();
		return obj;
	}
	*/
//[2]	-----------
		//오버라이딩 조건에 맞지않음
		//object > person 변경 불가능 >공변반환타입으로 해결
		// jdk1.5 공변반환타입 (convariant return type) 추가
		// 오버라이딩할 떄 부모메서드의 반환타입을 자식클래스타입으로 변경 가능 
	@Override 
	protected Person clone(){ //throws 생략가능. 오버라이딩 시 예외처리 갯수 적게 가능

		Person p =  null;
		try {
			p=(Person) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}	
//-----------	
}


/*	
class Person{

	@Override
	public String toString() {
		//return "Person [rrn=" + rrn + ", name=" + name + "]";
		return String.format("Person [rrn=%s, name=%s]", this.rrn, this.name);
	}

	String rrn;
	String name;
	//생성자 
	public Person(String rrn, String name) {
		super();
		this.rrn = rrn;
		this.name = name;
	}//생성자
	//주민번호만 같으면 equals 오버라이딩


	//object.equals()
	// p1.equals(p2) 업캐스팅, 매개변수 다형성
	// Person만 가지는 equals 오버라이딩
	@Override //오버라이딩 어노테이션 
	public boolean equals(Object obj) {

		//object instanceOf Object는 항상 true를 리턴
		//object가 null이라면 instanceOf는 항상 false를 리턴
		if (obj != null && obj instanceof Person) { //instanceof연산자=객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인
			Person p = (Person)obj ; //다운캐스팅
			return this.rrn.equals(p.rrn);
		}
		return false;
	}	
	//object.hastCode()
	//rrn이 같으면 해시코드도 오버라이딩
	@Override
	public int hashCode() {
		return this.rrn.hashCode();
	}
	 
}//Person
*/