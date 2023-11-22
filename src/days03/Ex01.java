package days03;


public class Ex01 {

	public static void main(String[] args) {
		String name ="홍길동";
		System.out.printf("%s\n",name); //홍길동
		System.out.printf("[%s]\n",name); //[홍길동]
		System.out.printf("[%10s]\n",name);//[       홍길동] 열자리를 확보하고 우측정렬
		System.out.printf("[%-10s]\n",name);//[홍길동       ] 열자리를 확보하고 좌측정렬
		
		int n = 50;
		System.out.printf("%d\n", n); //d=10진수
		System.out.printf("%#o\n", n); //o=8진수   *# flag값 붙이는 것 '0'62 8진수 표기법
		System.out.printf("%#x\n", n); //x=16진수                           '0x'32 16진수 표기법
		
		double pi = 3.141592;
		System.out.printf("%f\n", pi);
		System.out.printf("%.3f\n", pi); //자동 반올림처리
		System.out.printf("%10.3f\n", pi); //자동 반올림처리
		
		int no = 1;
		System.out.printf("%d\n", no);
		System.out.printf("%4d\n", no); //네자리 확보
		System.out.printf("%04d\n", no);//***확보한 자리에 0으로 표기
		
		System.out.printf("%d(%c)\n",65, 65); //65(A) %c문자의 코드값
		// java.util.MissingFormatArgumentException: Format specifier '%c'
		// 형식이 빠져서 예외(오류)가 발생함 %c에대한 값이 빠짐
		//System.out.printf("%d(%c)\n",65,);
		System.out.printf("%1$d(%1$c)\n",65);  //1$ = 매개변수
		
		
		
	}//main

}//class
