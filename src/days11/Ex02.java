package days11;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[]m= {3,5,2,4,1};//4가 있는 위치(index)에 100 삽입
		//1) 4 위치값 찾기
		int n =4;
		int index = sequentialSearch(m, n);
		System.out.println(">index : "+index);
		//temp[index>i?i:i+1]=m[i];
		//System.arraycopy()
		int [] temp = new int [m.length+1]; // 100 들어갈 자리. 배열 크기 증가
		
		for (int i = 0; i < m.length; i++) {
			if(index>i)temp[i] = m[i];
			else temp[i+1] =m[i];
			
		} //for
		//temp[index]>i?i:i+1=m[i];
		temp[index]= 100;
		m= temp;
		System.out.println(Arrays.toString(m));
	}//main
	//1)  4 위치값 찾기 
	private static int sequentialSearch(int[] m, int n) {
		int index=-1; //찾을 값이 없음 (검색시 찾을 값이 없을 때 -1 지정)
		for (int i = 0; i < m.length; i++) {
			if (n==m[i]) {
				index=i;
				break;
			}//if
		} //for
		return index;
	}//sequentialSearch
}//class
