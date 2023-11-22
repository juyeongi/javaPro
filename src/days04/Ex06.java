package days04;

import java.util.Iterator;

public class Ex06 {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <=10; i++) {
			if(i==10) {
				System.out.printf("%d",i);
			}else {
				System.out.printf("%d+",i);
			}
			sum +=i;
		} //for
		System.out.printf("=%d\n", sum);
		
	}//m

}//c


/*
		int sum= 0;
		for(int i=1; i <=10; i++){
			if (i==10) {
				System.out.printf("%d",i);
			}else {
				System.out.printf("%d+",i);

			}

			sum=sum+i;
			System.out.printf("=%d\n", sum);		
*/