package days06;

import java.util.Iterator;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		//잘못 입력된 값 
		//정규표현식, 예외처리
		int n; //정수를 저장할 변수 선언
		
		try (Scanner scanner= new Scanner(System.in)) {
			//문자x,실수x 정수만 가능
			System.out.print(">정수(n)입력");
			String inputData=scanner.nextLine();
			char[] idArr= inputData.toCharArray();//입력받은 데이터 배열로받기 (id:  inputData)
			boolean flag = false; // 숫자가 아닐 시 ->true
			for (int i = 0; i < idArr.length; i++) {
				//idArr[i] 숫자 체크
				if(!('0' <= idArr[i] && idArr[i] <='9'))
					//if('0' >idArr[i] || idArr[i] >'))
					flag= true;
				break;// 숫자가 아닌 것을 찾아내면 더이상 for문 중단
				
			} //for
			/*
			if (flag==true) {
				System.out.println("입력잘못");
			} else {
				n= Integer.parseInt(inputData);
				System.out.println(n);
			}//if
			//n=scanner.nextInt();
			System.out.println(n);
			*/
			if (!flag) { //flag==false 참/거짓 바꾸는 연산작업
				n= Integer.parseInt(inputData);
				System.out.println(n);
			} else {
				System.out.println("입력잘못");
			}//if
			//n=scanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
	}//main

}//class
