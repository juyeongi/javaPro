package days07;

public class Ex05_02 {
	public static void main(String[] args) {
		//[정규표현식]
		//국어점수 kor 입력받아서
		//0<=<=100
		//올바른 국어점수, 잘못된 국어점수 출력
		//int [] kor= {99, 1, 100, 101, -90, 0};
		String kor="100";
		//String regex= "\\d{3}"; //100~ 999 true
		//String regex= "\\d{1,2}|100";//1~99 true ,100 true **00~09 true
		//String regex= "100|{1-9}\\d"; 100, 1-~99 true
		String regex= "100|[1-9]?\\d"; //? 1-9가 와도 안와도 가능 \\d :0~9까지
		System.out.println(kor.matches(regex));
				
				
	
		
		
			
		
		
		
	}//main

}//class
