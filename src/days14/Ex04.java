package days14;

public class Ex04 {
	public static void main(String[] args) {
		//[private 필드 t선언]
		//pirvate 사용 이유
		// 1)pirvate 필드 + 유효한 값만을 필드가 사용
		// 2)필드를 읽기전용, 쓰기전용으로 사용하기 위해
		//The constructor Person(boolean) is undefined
		//생성자 생성x 오버로딩 생성
		Person p1 = new Person(true); //생성자를 통해 값 할당
		System.out.println(p1.isGender());
		//p1.age= -20 ; (외부에 잘못된 값으로 지정되는것을 막기위해)
		//방법. getter,setter 선언
		//getter만 사용 읽기전용, setter만 사용 쓰기전용
		/*
		if (n 0-130) {
			p1.age=n;
		}
		*/
		p1.setAge(-20);
		System.out.println(p1.getAge() );
		
		//접근지정자를  사용하여 필드 숨김 ( 은닉화 ) 
		//The field Person.age [[is not visible]]
		/*
		p1.name = "홍길동";
		p1.age = 20;
		p1.gender = true;
		*/
	}//main
}

//같은 자바파일 안에 클래스 선언 가능
//다른 패키지에서 사용 x 동일한 패키지에서 사용하기 위해
//The public type person must be defined in its own file
//하나의 파일에 같은이름의 클래스만 public으로 사용가능 
/*
class person{	
}
*/