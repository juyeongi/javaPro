package days18;

public class Ex05 {
			//예약어 class
	public static void main(String[] args) {
		//Object.equals()
		//Object.hashCode()
		//Object.toString()
		//Object.getClass() - 객체의 클래스정보를 담고있는
		//class인스턴스 반환하는 메서드
		
		Person p1 = new Person ("111","홍길동");
		Class cls = p1.getClass(); //클래스타입의 객체 리턴 
		// cls 식별자.능 class 사용 불가, class에 사용되는 예약어class가 있기때문
		//예약어는 식별자 사용 불가능
		
		System.out.println(cls.getName());  //days18.Person
		System.out.println(cls.getSimpleName()); //Person 클래스이름
	}//main
}//class
