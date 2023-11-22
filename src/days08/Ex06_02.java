package days08;

public class Ex06_02 {
	public static void main(String[] args) {
		
		int n=10;
		int result =sum(n);
		result =recursiveSum(n);
		System.out.printf("1~%d=%d\n",n,result);
		//[1]1~n 합 재귀함수   (시험)
		
		
	}//main
	
	//10 +recursiveSum(9)
	//   9+recursiveSum(8)
	//   8+recursiveSum(7)
	//10+9+8+....+2+1
	//재귀함수

	private static int recursiveSum(int n) {
		if(n==1) return n;
		else return n+recursiveSum(n-1);
	}//if
		
	private static int sum(int n) {
		int result=0;
		for (int i = 1; i <=n; i++) {
			result+=i;
			
		} //for
		return result;
	}
}//class
