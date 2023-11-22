package days07;

public class Ex06_02 {
	public static void main(String[] args) {
		//1-2+3-4+5-6+7-8+9-10=-5
		//홀수 sum+=1   %-
		//짝수 sum+=1   %+
		//switch변수 사용 : 번갈아서 실행될 때
		boolean sw= false; // boolean의 기본값 false
		int sum=0;
		for (int i = 1; i <=10; i++) {
			/*
			if (sw) {//짝수일 때 //
				sum-=i;
				System.out.printf("%d+",i);
				//sw= false; //홀수로 넘어가기위해
			} else {
				sum+=i;
				System.out.printf("%d-",i);
				//sw=true; //짝수로 넘어가기위해

			}//ifelse
			sw=!sw;  //sw=true;+//sw= false; 한번에 표기
			*/
			
			sum += sw ? -i : i;
			System.out.printf(sw?"%d+":"%d-", i);
			sw=!sw;
			
		} //for
		System.out.printf("=%d\n",sum);
	
	}//main

}//class
