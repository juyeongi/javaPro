package days07;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex07_03 {
	//피보나치 수열
	//1, 1, 2, 3, 5, 8, 13, 21, 34...
	//처음 두 항 1 , 1 은 고정값, 앞 두 항을 더해서 값을 산출
	//[문제] 항이 100 같거나 작을 때 까지의 수열을 출력하고
	//합을 구해서 출력
	//1+1+2+3+5+8+13+....=?
	public static void main(String[] args) {
		/*
		int [] p= new int [20]; //임의의 수 20 //ArrayList 컬렉션클래스 사용 가능
		p[1] =p[0] =1;
		//0  1   2
		//[1][1][][][][][][]...
		int index =2;
		while(true) {
			int term=p[index-1]+p[index-2];
			if (term>100) break;
			p[index]=term;
			index++;
		} //for
		System.out.println(Arrays.toString(p));
		System.out.println(index);
		//람다식과 스트림 ..참고
		int sum =IntStream.of(p).sum();
		System.out.println(sum);
		*/
		
		//[2]
		//첫번째 항 1
		//두번째 항 1
		int firstTerm =1;
		int secondTerm =1;
		int nextTerm;
		int sum=firstTerm+secondTerm;
		System.out.printf("%d+%d+",firstTerm, secondTerm);
		//1+1+   에서 시작
		// f  s
		//     f  s
		//         f   s
		// 1+1+2+nextTerm
		/*
		while (true) {
			nextTerm =firstTerm+secondTerm;
			if (nextTerm>100) break;
			System.out.printf("%d+",nextTerm);
			sum+=nextTerm; // 출력 다음의 sum : 출력값이 누적됨
			firstTerm=secondTerm;//****처음의 firstTerm과 secondTerm이 출력되고 나면
			secondTerm=nextTerm;//****secondTerm이 firstTerm이 되고 nextTerm이 secondTerm이 됨 
			                                   //*반복*
			
		}//while
		System.out.printf("=%d\n", sum);
		
		*/
		//[2]
		while ((nextTerm =firstTerm+secondTerm)<=100) {
			//nextTerm =firstTerm+secondTerm;   //  ㄴ 두 코딩 합쳐짐
			//if (nextTerm>100) break;
			System.out.printf("%d+",nextTerm);
			sum+=nextTerm; 
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			
		}//while
		System.out.printf("=%d\n", sum);
		
	}//main

}//class
