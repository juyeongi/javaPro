package days01;

public class Ex04_02 {

	
	//본인의 이름을 name이라는 변수를 선언하고
	//본인의 나이를 age라는 변수를 선언하고
	//이름과 나이를 출력하는 코딩을 하세요.
	
	public static void main(String[] args) {
		String name;
		int age;
		name = "이주영";
		age = 30;
		//오류:The local variable name may not have been initialized
		//지역변수(name)는 반드시 한번은 값을 할당하는 작업을 해야함
		
		//나이를 지정할 변수 선언
	    //자료형 변수명=초기값;
				//숫자(정수)를 나타내는 정수자료형 age="20"
		System.out.println(age);
		
		System.out.println(name);

	}//main
	
	
	
}//class
