package days06;
//5일차복습 2)
import java.util.Arrays;
import java.util.Random;

public class Ex01_02 {
	public static void main(String[] args) {
		//10개정수를 임의의 값(5~15)으로 저장(배열) ->가장 큰 값
		//10개정수를 임의의 값(0~10)+5으로 저장(배열) ->가장 큰 값
		//0.0<= double Math.random()<1.0
		//10개정수를 임의의 값(0~10)+5으로 저장(배열) ->가장 큰 값
		//5<= (int) (Math.random()*11+5)<16
		
		//임의의 랜덤한 수(정수,실수)를 만들어줌
		Random rnd=new Random();
		//rnd.nextInt(int bound)
		int []m = new int [10];
		for (int i = 0; i < m.length; i++) {
			//5<= (int) (Math.random()*11+5)<16
			//임의의 정수 채워넣기
			m[i]=rnd.nextInt(11)+5;
		} //for
		//m배열의 각 요소를 출럭(확인)
		//toString : 배열을 문자로 변환
		//배열을 구현하기 쉽도록 자동적으로 요소를 출력해줌
		System.out.println(Arrays.toString(m));
		//int max=m[0];
		//int min=m[0];
		int max, min;
		max=min=m[0];
		//m의 0번째를 max값으로 지정 후 다음값을 비교하여 큰 값을 max에 담음
		for (int i = 1; i < m.length; i++) {
			//0번째는 max에 저장되어있기때문에 비교할 다음숫자부터 
			if (max<m[i]) {
				max=m[i];
			}else if (min>m[i]) {
				min=m[i];
			}//if
		} //for
		System.out.println(max+"/"+min);
		
	}//main

}//class
