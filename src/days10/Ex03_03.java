package days10;

import java.util.Arrays;

public class Ex03_03 {
	public static void main(String[] args) {
		
		int []m = new int [3];
		m[0]=5;
		m[1]=3;
		m[2]=7;
		//ArrayIndexOutOfBoundsException: 
		//Index 3 out of bounds for length 3 at days10.Ex03_02  //배열크기 이상으로 선언 불가
		//m[3]=10;
		
		int index=3;
		if(index ==m.length) {
			int[]temp = new int [ m.length+3];
			//temp[0]=m[0];
			//temp[1]=m[1];
			//temp[2]=m[2];
			for (int i = 0; i < temp.length; i++) {
				temp[i] =m[i];
				
			} //for
			m=temp;//temp주소값을 m배열로
		}
		
		//1. 원래 배열크기 +3 증가.
		//[5][3][7]
		//[][][][][][]                 []temp
		//2. m -> temp요소 복사
		//3. temp배열을 m배열로 바꾸는 코딩
		m[3]=10;
		System.out.println(Arrays.toString(m));
	}
}
