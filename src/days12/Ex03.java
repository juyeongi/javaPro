package days12;

import java.util.Arrays;

public class Ex03 {
		//이진검색 binarySearch
		//정렬이 되어있어야함
	public static void main(String[] args) {
		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
                86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
             169, 172, 181, 184, 185, 191, 198 };
      System.out.println(   Arrays.toString(m)   );
      //System.out.println(m.length); 50개
      
      	int n= 94;
      	int index = binarySearch(m, n); //m배열에서 n찾아서 index에 반환
      	if(index==-1) {
      		System.out.println("찾는 정수 없음");
      	}else {
      		System.out.println(index + "위치에 있다");
      	}
	}//main
		//이진검색
		// 							 0            49
		//0~m.length-1  bottom  24    top 변수에 저장
		//                              middle(중간값)
		//                              m[middle]
		//m[middle] == n
		//                >     top = middle -1
		//                <     bottom = middle +1
		//데이터의 중간값을 지정해서 찾는 수와 맞는지 비교. 틀리면 정렬된 한쪽 값들을 버리고
		//다시 남은 반의 값에서 중간값을 지정해서 반복  ==>top, middle, bottom 위치가 같아지면 끝
		//최대 몇번 반복인지 알아볼 때 = int값에 없는 큰 값 대입해보기 
		
		
		private static int binarySearch(int[] m, int n) {
			int bottom = 0, middle, top= m.length-1;
			int count =0;
			while (bottom<=top) {
				count++;//while문이 돌 때마다 1증가
				middle= (top+bottom)/2;
				if(m[middle]==n) {
					System.out.println(">찾은 횟수 : "+count);
					return middle;
				}else if (m[middle]> n) {
					top = middle =1;				
				}else {
					bottom=middle+1;
				}//if
			}//while
			System.out.println(">못찾은 횟수 : "+count);
			return -1; //찾고자하는 값이 없을 때
			
			
			
			
			
			/*
			int t = 0;
			int b = m.length-1;
			int middle = t+b/2;
			boolean flag =false;
			for (int i = 0; i < m.length-1; i++) {
				if (m[middle]==n) {
					flag =true;
				}else if (m[middle]>n) {
					t = middle-1;
				}else if (m[middle]<n) {
					b=middle+1;
				}//if
				System.out.printf("%d", n);
			} //for
			
			return middle;
			*/
			
		}
}
