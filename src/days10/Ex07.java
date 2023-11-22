package days10;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		//                                           44032   55203
		System.out.printf("%d\t%d\n",(int)'가',(int)'힣');
		Random rnd = new Random();
		char one=(char)(rnd.nextInt('힣'-'가'+1)+'가');  //44032   55203 사이의 정수값
		System.out.println(one);//가 ~ 힣 무작위 한 문자
	}//

}//
