package days11;

import java.util.ArrayList;

public class Ex03 {
	//순차검색
	public static void main(String[] args) {
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		int max=92;
		//max가 있는 위치(index) 모두 출력
		/*
		int beginIndex=0;
		int index =sequentialSearch(m, max, beginIndex);
		System.out.println("찾은 위치(index): "+index);		
		
		beginIndex=index +1;
		index =sequentialSearch(m, max, beginIndex);
		System.out.println("찾은 위치(index): "+index);		
		
		beginIndex=index+1;
		index =sequentialSearch(m, max, beginIndex);
		System.out.println("찾은 위치(index): "+index);		
		*/
		int beginIndex=0;
		int index=-1;
		boolean flag=false;
		while ((index =sequentialSearch(m, max, beginIndex)) !=-1){
			flag =true;
			System.out.println("찾은위치 (index): "+ index);
			beginIndex =index +1;
		}//while
		
		if(! flag ) System.out.println("검색결과x");
		
		/*[2]
		do {
			index =sequentialSearch(m, max, beginIndex);
		}while (index != -1)
		*/
		/*[1]
		
		int Index =sequentialSearch(m, max, beginIndex);
		while(index != -1) {
			index =sequentialSearch(m, max, beginIndex);
			if(index != -1)
			System.out.println("찾은 위치(index): "+index);
		}//while
		*/
		/*
		ArrayList list = new ArrayList();
		for (int i = 0; i < m.length; i++) {
			if(m[i]==max) {
				System.out.println(i);
			}//if
		} //for
		System.out.println(list);
		*/
	}//main
	//중복함수(오버로딩)
	private static int sequentialSearch(int[] m, int n, int beginIndex) {//int beginIndex 찾을 위치값 지정
		int index=-1; //찾을 값이 없음 (검색시 찾을 값이 없을 때 -1 지정)
		for (int i = beginIndex; i < m.length; i++) {
			if (n==m[i]) {
				index=i;
				break;
			}//if
		} //for
		return index;
	}//sequentialSearch
	
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
