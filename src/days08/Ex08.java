package days08;

import java.util.Iterator;

public class Ex08 {

	public static void main(String[] args) {
		// 2^3=2*2*2=8
		//2^-3 =1/(2^-3)= 1/8
		//[거듭제곱] ==누승==명==pow
		//밑수(2)를 지수(2)만큼 반복해서 곱하는 것 
		
		//일반함수1)
		//int result = pow(2,3);
		//System.out.println(result);
		//일반함수2)
		//double result = pow(2,-3); 
		//System.out.println(result);
		
		//재귀함수
		double result =recursivePow(2,3); 
		System.out.println(result);
	}//main
	
	//재귀
	private static double recursivePow(int n, int m) {
		if (m>1) return n * recursivePow(n, m-1);
		else if(m==1 ) return n;
		else if(m==0 ) return 1; //0승은 1
		else return (double) 1/( recursivePow(n,-1*m));

	}//rec.pow

	
	//일반함수1)
	/*
	private static int pow(int n, int m) {
		int result =1;
		for (int i = 1; i <=m; i++) {
			result*=n;
		} //for
		return result;	
	}//pow
	*/
	//2)
	/*
	private static double pow(int n, int m) {
		double result =1;
		//int exp= m;
		//if(m<0)exp=-1*m;//음수를 양수로 바꾸기
		int exp= Math.abs(m); //절대값 반환함수 abs()
		for (int i = 1; i <=exp; i++) {
			result*=n;
			
		} //for
		if (m<0) return (double)1/result;
		else return result;

		
	
	}//pow(-)
	*/
	
}//class
