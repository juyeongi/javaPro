package days11;

import java.util.Arrays;
import java.util.Random;

public class Ex04_02 {
	public static void main(String[] args) {
		//int[]m =new int [30]   0~9 임의의 정수
		//0-3개 , 1-0개 , 9-4개 ...
		//int [] m = new Random().ints(30,0,10).toArray();
		
		int []m= new int [30];
		int n;
		//count[0] =0의 갯수 저장
		//count[1] =1의 갯수 저장
		//count[9] =9의 갯수 저장
		int [] counts= new int [10];
		for (int i = 0; i < m.length; i++) {
			//m[i]=(int)(Math.random()*10);
			n=getRandomInt(0,9);
			m[i]=n;
			counts[n]++;
		} //for
		
 
	}//main
	public static int getRandomInt(int min, int max) {
		return (int)(Math.random()*(max-min)+1)+min;
	}
}//class
