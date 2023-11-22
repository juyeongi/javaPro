package days07;

public class Ex07 {
	public static void main(String[] args) {
		//1. 1/2+2/3+3/4+ ... +8/9+9/10 =???
		
		//분자1 2 3 4 ...9       i
		//분모2 3 4 5 ...10      i+1
		//하나를 기준으로 잡아 for문돌리기
		//[1]
		/*		
		int sum =0;
		for (int i = 1; i <=9; i++) {
			sum+=i/(i+1);
			System.out.printf("%d/%d+",i,(i+1));
		} //for
		System.out.printf("=%d\n", sum);
		//int *int 연산이라 정수값 나옴.
		*/
		//실수값으로 강제형변환
		double sum =0;
		for (int i = 1; i <=9; i++) {
			sum+=(double)i/(i+1);
			System.out.printf("%d/%d+",i,(i+1));
		} //for
		System.out.printf("=%f\n", sum);
		
		//
	}//main
}//class
