package days07;

public class Ex06 {
	public static void main(String[] args) {
		//1-2+3-4+5-6+7-8+9-10=-5
		//홀수 sum+=1   %-
		//짝수 sum+=1   %+
		int sum=0;
		for (int i = 1; i <=10; i++) {
			
			if (i%2==0) {//짝수일 때
				sum-=i;
				System.out.printf("%d+",i);
			} else {
				sum+=i;
				System.out.printf("%d-",i);

			}//if
			
		} //for
		System.out.printf("=%d\n",sum);
	
	}//main

}//class
