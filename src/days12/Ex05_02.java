package days12;

public class Ex05_02 {
		//가변배열 
	public static void main(String[] args) {
		//세 반의 학생 수가 다를 때
		//열 선언 x
		//열의 길이가 다르게 출력
		String [][] names = new String [3][];
		names[0]= new String [25];
		names[1]= new String [20];
		names[2]= new String [30];
		
		for (int i = 0; i <names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.println("[]");
		
			} //for
		} //for
	}//main

}//class
