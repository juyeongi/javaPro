package days08;

import java.util.Random;

public class Ex09 {
	public static void main(String[] args) {
		//로또6/45
		//1~45 정수 중 6개 출력
		//0.0<int Math.random()*45+1<46// double  > int로
		//(int)(Math.random()*45)+1
		
		//Random rnd == new random();
		//rnd.nextInt(45)+1
		
		for (int i = 1; i <=6; i++) {
			int lottoNumber=(int)(Math.random()*45)+1;
			System.out.println(lottoNumber);
		} //for
		
	}//main

}//class
