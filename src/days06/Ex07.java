package days06;

public class Ex07 {
	public static void main(String[] args) {
		//LG공채 
		//이름 붙은 반복문
		// break 이름;     //continue 이름; 가능
		out:for (int i = 2; i <=9; i++) {//단
			in:for (int j = 1; j <=9	;j++) {//행
				System.out.printf("%d*%d=%02d  ", i,j,i*j);
				if (j==5) {
					break out; //in for문에 걸린 break인지만 for문에 이름을 붙이고
					                 //break구간을 정할 수 있다.
				}//if
			} //for
			System.out.println();
		} //for
	}//main
}//class
