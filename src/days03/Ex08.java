package days03;

public class Ex08 {
	public static void main(String[] args) {
		
		
		//Type mismatch: cannot convert from double to float
		// float pi = (float) 3.141592;
		float pi = 3.141592f;
		//소수점 네번째 자리에서 반올림한 실수값을 얻어와서 출력
		//변수에 값이 저장이 안되어 다른 연산에 사용불가능
		//System.out.printf("%.3f\n", pi);
		
		//pi = Float.parseFloat(String.format("%.3f", pi) ); //3.142
		//System.out.println(pi);
		
		System.out.println(pi * 1000); //3141.592
		System.out.println ((int) (pi * 1000)); // 3141 cast연산자로 강제형변환
		//System.out.println ((int) (pi * 1000/1000)); // int int 연산은 소수점 표기 x
		System.out.println ((int) (pi * 1000/1000f)); //3
		
		//System.out.println(pi * 1000+ 0.5); //3141.592
		//System.out.println ((int) (pi * 1000+ 0.5)); // 3141 cast연산자로 강제형변환
		System.out.println ((int) (pi * 1000+ 0.5)/1000f); 
		//네번째에서 절삭하여 출력
		
	}//main

}//class
