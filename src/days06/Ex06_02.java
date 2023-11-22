package days06;

public class Ex06_02 {
	public static void main(String[] args) {
		//구구단_while문
		int dan=2;
		int i=1;
		while (dan<=9) { //2~9단
			System.out.printf("[%d단]\n", dan);
			i=1; //다음단으로 넘어갈 때 다시 *1로 초기화 
			//단을 출력하는 while문 :
			while (i<=9) {
				System.out.printf("%d*%d=%d\n", dan, i, dan*i);
				i++;
			}//while
			dan++;//다음 단으로 넘어감
		}//while
		/*
		 * 
		int dan=2;
		while (dan<=9) { //2~9단
			System.out.printf("[%단]\n)", dan);
			
		}//while
		*/
	}//main
}//class
