package days02;

public class Ex06 {

	public static void main(String[] args) {
		String name = "이주영"; //%s
		int age = 20; //%d
		final double PI = 3.141592; //소수점 6자리까지 출력 %f
		char garde = 'A'; //%c
		
		System.out.printf("이름: %s, 나이: %d, PI: %f, 등급: %'c'\n", name, age, PI, garde);
		
		int i= Integer.MAX_VALUE;
		//Integer.MIN_VALUE
		
		         //int j= i + 100; int값의 범위 초과하여 결과값오류
				//대입연산자 : 우측항을 연산 후 결과값을 좌측에 대입
		        //좌측을 long으로 바꿔도 변함x 우측값을 long형으로 강제형변환
		
		
		
	}//main
}//class
