package days10;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int []m= {3,5,2,4,1};
		System.out.println(Arrays.toString(m));
		//요소 추가(가장 마지막) (append)
		//삽입(insert) : 1.크기증가 2. 자리 뒤로 밀기
		//[3,5,100,2,4,1]
		int index=2;
		int n =100;
		//3  5 100 2  4  1
		//[] [] [X] [] [] []
		int []temp=new int [m.length+1];
		/*
		System.arraycopy(m, 0, temp, 0, index);
		temp[index]=100;
		System.arraycopy(m, index, temp, 
				index+1, m.length-1);
		m=temp;
		*/
		// m   [3, 5, 2, 4, 1]
		//temp[3][5][][2][4][1]
		
		for (int i = 0; i < m.length; i++) {
			if (index>i) {temp[i]=m[i];} 
			else if(index<=i) {temp[i+1]=m[i];}
		} //for
		temp[index]=100;
		m=temp;
		System.out.println(Arrays.toString(m));

	}//main
}//class
