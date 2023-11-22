package days10;

import java.util.Arrays;
import java.util.Random;

public class Ex06_03 {
	public static void main(String[] args) {
		int [] tots = new int [20];
		int [] ranks = new int [20];
		
		Arrays.fill(ranks, 1);
		
		Random rnd= new Random();
		for (int i = 0; i < tots.length; i++) {
			//0~300
			int tot = rnd.nextInt(301); // 0<= int < 301
			tots [i] = tot;
		} //for
		System.out.println(Arrays.toString(tots));
		
		//등수처리
		//1번  1/2/3/4/5/6/7/8/9/10/
		//2번  1/2/3/4/5/6/7/8/9/10/
		//3번  1/2/3/4/5/6/7/8/9/10/
		for (int i = 0; i < ranks.length; i++) { //등수 지정 학생
			ranks[i] =1; 
			for (int j = 0; j < ranks.length; j++) { //j:비교대상 학생
				//if(i==j) continue; // 자기자신과 비교 x
				//if (ㅑ!=j && tots[i] <tots[j]) {
				if (tots[i] <tots[j]) {
					ranks[i]++;
				}
			} //for
		} //for
		
		System.out.println(Arrays.toString(ranks));

	}//main

}//class
