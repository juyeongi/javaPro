package days07;

public class Ex10 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
		
		//두 정수의 합을 구해 반환하는 
		//sum()함수 선언
		//sum()함수 호출
		//int c=a+b;
		
		//type별 리턴값
		//String.br.readLine();
		//int System.in read();
		//double.Math.random(); 
		
		
		int result = sum(a, b,c);
		
		System.out.printf("%d+%d=%d\n",a,b,c);
	}//main
	
	
	public static int sum(int a, int b, int c2) {
		int c =a+b; //return문 수식; 가능
		return c;
	}//sum
	

}//class
