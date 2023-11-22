package days08;

public class Ex07 {

	public static void main(String[] args) {
		//[2]팩토리얼(factorial) ==계승
		//    정의) 1에서 양의 정수의 곱
		// n!=n*(n-1)*(n-2)*...*1
		// 5! =5*4*3*2*1 
		// 0! = 1 (약속)
		
		//일반함수
		//int result = factorial(5);
		//System.out.println(result);
		//재귀함수
		int result = recursiveFactorial(5);
		System.out.println(result);
	}//main

	private static int recursiveFactorial(int n) {
		if (n>1) return n*recursiveFactorial(n-1);
		else if (n==1 || n==0) return 1;
		else return -1; //음수일 때
	}//recursiveFactorial

	private static int factorial(int n) {
		//5*4*3*2*1
		if (n<0) return -1; //음수일 때
		int result =1;
		for (int i = n; i>=1; i ++) {
			result = result*i;
		} //for
		return result;
	}//factorial

}//class
