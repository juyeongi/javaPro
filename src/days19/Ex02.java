package days19;

import java.util.Arrays;
// https://school.programmers.co.kr/learn/courses/30/lessons/120913
public class Ex02 {
	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		int n =6;
		
		String [] answer = Solution.solution(my_str, n);
		System.out.println(Arrays.toString(answer));
		/*
		String my_str = "abcdef123";
		int n =3;
		*/
	}
}
//[1]
class Solution {
    public static String [] solution (String my_str, int n ){
    	//int answerLength=16/6;//배열 방 2개나옴
    	int answerLength=(int)Math.ceil((double)my_str.length()/n);  // 2.9xxxx올림 하기
    								//ㄴ double 타입이라 방 3.0개 , int로 형변환
    	//배열에 6개씩 나눠서 담기  6/6/4 배열 방 3개
    	String [] answer = new String [answerLength];
    	/*//문자열자르기
    	String a = my_str.substring(0,6);
    	System.out.println(a);
    	
    	a=my_str.substring(6,12);
    	System.out.println(a);
    	
    	//begin 12, end 18, length 16 18자리 없음
    	a=my_str.substring(12,16);
    	System.out.println(a);
    	 */
    	int beginIndex=0, endIndex;
    	String str =null; //문자열자르기 
    	int my_strLength=my_str.length();
    	int index =0;
    	while (index!=answerLength) {
    		endIndex = beginIndex +n;
    		// 0-6,6-12							//12-끝까지
    		if(endIndex>my_strLength) endIndex=my_strLength;
    		str = my_str.substring(beginIndex, endIndex);
    		beginIndex=endIndex;
    		answer[index++] = str;
		}//while
    return answer;
  //[2]  
    /* 
    int i = 0, idx = 0;
    try {
       for (             ; i < my_strLength ; i+=n, idx++) {
           answer[idx] =   my_str.substring(i, i+n );
         } 
    } catch (Exception e) {
       answer[idx] =   my_str.substring(i);
    }
    */
   

    }
}