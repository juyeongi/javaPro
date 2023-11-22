package days03;

public class Ex05_05 {
	
	//***단항연산자 :[++ -- + - ~(비트부정연산자) !(NOT연산자)]

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이항연산자 아닌 양,음수를 나타내는 단항연산자
		System.out.println(+3); //양수
		System.out.println(-3); // 음수
		
		//비트(0,1)부정연산자 0->1, 1->0
		System.out.println(~5); //-6 :
		//                 5 = 0000 0101
		//            부정값 = 1111 1010
		//  -1                   1111 1001
		//  보수                 0000 0110
		//  절대값                            6
		//                            ==> -6
	
		
	}//main

}//class
