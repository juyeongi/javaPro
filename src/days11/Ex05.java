package days11;

import java.util.Arrays;

public class Ex05 {
	public static void main(String[] args) {
		int[]m = {3,5,2,4,1};
		//버블정렬
		//bubbleSort(m);
		//선택정렬
		selectionSort(m);
		selectionSort2(m);
		
		//삽입정렬
		//병합정렬
		
	}//main
//**시험
	private static void selectionSort2(int[] m) {
		//[0]  1  2  3  4  index (위치)
		//3  5  2  4  1  element (요소)
		//i= 0  선택
		//0>1 [0>2] 0>3 [0>4]
		//1회 회전시 가장 작은 값의 위치를 min(최소값)에 저장해둔 후 회전이 끝나고 작은 값과 자리바꿈
		for (int i = 0; i <m.length-1; i++) {//선택 위치
			int minIndex=i;
			for (int j = i+1; j <m.length; j++) {//다음 선택위치로 넘어가는 for문
				if(m[minIndex]>m[j])minIndex=j;
			} //for
			int temp =m[i];
			m[i]=m[minIndex];
			m[minIndex]=temp;
			System.out.println(Arrays.toString(m));
		} //for
		System.out.println();
	}//selectionSort2

	private static void selectionSort(int[] m) {
		//0  1  2  3  4  index (위치)
		//3  5  2  4  1  element (요소)
		//[선택]
		//0-1  0-2  0-3  0-4  == [1] 5  3  2  4
		//1-2  1-3  1-4        == (1)[2]  5  4  3
		//2-3  2-4               ==(1) (2) [3]  5  4
		//3-4                      ==(1)(2)(3)[4][5]
		//행 i+1 , 
		/*
		for (int i = 0; i <m.length-1; i++) {//length 나열최대치, i 지정자리
			for (int j = i+1; j <m.length; j++) {// 비교 지정 다음
				System.out.printf("%d-%d",i,j);
				if(m[i]>m[j]) {
					System.out.print("***");
					int temp=m[i];
					m[i]=m[j];
					m[j]=temp;
				}//if
				System.out.println(Arrays.toString(m));
			} //for
			System.out.println();
		} //for
		
		*/
	}//selectionSort

	public static void bubbleSort(int[]m) {
		//i=i+1
		//0-1 1-2-2-3 3-4 비교 큰 숫자를 뒤로   1회전 :'4'자리정렬
		//0-1 1-2  ...                                 2회전 :'3'자리정렬
		//3회전 :'2'자리 정렬 4회전 :'1'자리 정렬
		//0  1  2  3  1회전
		//0  1  2      2회전
		//0  1          3회전  
		//0              4회전

		//****
		//***
		//**
		//*
		//a>b 오름차순(ascending)12345
		//a<b 내림차순 (decending)54321
		/*
		//별찍기
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <=5-i; j++) {
				System.out.print("*");

			} //for
			System.out.println();	
		} //for
		*/
		/*
		for (int i = 1; i <=4; i++) {
			for (int j = 0; j <=4-i; j++) {
				System.out.printf("%d-%d",j,j+1);
				if (m[j]>m[j+1]) {//오름차순 정렬
					//if (m[j]<m[j+1]) {//내림차순 정렬
					System.out.print("***");//정렬된 행 *표시
					int temp=m[j];
					m[j]=m[j+1];
					m[j+1]=temp;
				}
				System.out.println(Arrays.toString(m));
			} //for
			System.out.println();	
		} //for
		*/

	}//bubleSort
}//class
