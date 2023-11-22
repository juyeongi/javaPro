package days01;

public class Ex04 {

	
	//본인의 이름을 name이라는 변수를 선언하고
	//본인의 나이를 age라는 변수를 선언하고
	//이름과 나이를 출력하는 코딩을 하세요.
	
	public static void main(String[] args) {
		String name;
		name = "이주영";
		//오류:The local variable name may not have been initialized
		//지역변수(name)는 반드시 한번은 값을 할당하는 작업을 해야함
		
		System.out.println(name);

	}//main
	
	
	
}//class
