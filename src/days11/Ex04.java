package days11;

import java.util.Arrays;
import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
		//int[]m =new int [30]   0~9 임의의 정수
		//0-3개 , 1-0개 , 9-4개 ...
		//int [] m = new Random().ints(30,0,10).toArray();
		int []m = {0, 6, 9, 8, 0, 2, 5, 5, 1, 5, 6, 7, 6, 7, 5, 4, 7, 0, 4, 3, 5, 6, 6, 1, 2, 1, 8, 2, 1, 5};
		System.out.println(Arrays.toString(m));
		/*
		//max 92 maxCount=3
		int  count0=0;
		for (int i = 0; i < m.length; i++) {
			if(m[i]==0) count0++;
			
		} //for
		System.out.printf("0 - %d\n", count0);
		*/
		//max 92 maxCount=3
			for (int i = 0; i <=9 ; i++) {
				int  count=0;
				for (int j = 0; j < m.length; j++) {
					if(m[j]==i) count++;
					
				} //for
				System.out.printf("%d - %d\n",i, count);
			}//for
			

			/*
			int count0 = 0;
			for (int i = 0; i < m.length; i++) {
				if( m[i] == 0 ) count0++;
			} // for
			System.out.printf("0 - %d\n", count0);
			
			int count1 = 0;
			for (int i = 0; i < m.length; i++) {
				if( m[i] == 1 ) count1++;
			} // for
			System.out.printf("1 - %d\n", count1);
			
			//:
			int count9 = 0;
			for (int i = 0; i < m.length; i++) {
				if( m[i] == 1 ) count9++;
			} // for
			System.out.printf("9 - %d\n", count9);	
			*/
	}//main
}//class
