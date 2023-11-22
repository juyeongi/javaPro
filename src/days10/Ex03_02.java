package days10;

import java.util.Arrays;

public class Ex03_02 {
	public static void main(String[] args) {
		
		int []arr= {1,2,3,4,5};
		
		int []arrCopy=Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arrCopy));
		
		int []m = new int [3];
		m[0]=5;
		m[1]=3;
		m[2]=7;
		//m       [1][2][3][4][5]
		//temp   [][][][2][3][][]
		
	
		int index=3;
		if(index ==m.length) {
			int[]temp = new int [ m.length+3];
			System.arraycopy(m, 1, temp, 0, m.length);//배열 복사
			//System.arraycopy(m, 0, temp, 4, 2);//배열 복사
			//(복사(배열)대상, 배열시작점 ,배열 선택,배열 입력 위치,끝나는)
			//array클래스 배열을 다루기 쉽도록 기능 구현
			m=temp;
			//원하는 만큼 원하는 위치에 저장 가능
		}//if
		m[3]=10;
		System.out.println(Arrays.toString(m));
	}
}
