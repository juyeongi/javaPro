package days14;
//Class file collision: A resource exists with a different case: '/javaPro/bin/days14/person.class'.
//저장
public class Person { 
	//필드
	private String name; 
	private int age;
	private boolean gender;
	
	public Person() {}
	
	public Person(boolean b) {
		gender=b;
	}
	
	// alt + shift + s context menu
	//getter, setter 선언
	public void setAge(int n) {
		if (0<=n && n<=130) {
			age = n;
		} else {
			//강제 예외(오류 )발생
			//[예외처리]throw문 -강제로 예외던짐 
			throw new RuntimeException("Person.age 1~130 실행오류");
		}//if
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//gender 필드는 읽기전용으로 사용
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
}//class
