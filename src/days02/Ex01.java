package days02;

public class Ex01 {

	//p82
	public static void main(String[] args) {
		
		System.out.println("main() 시작");
		otherMethod(); //매소드호출
		System.out.println("main() 종료");
		
	}//main
	
	private static void otherMethod() {
		System.out.println( "otherMethod() 시작" ); 
		for (int i =1; i<= 10; i++) {
			if (i == 5) {
			}			
			
		}
	
		System.out.println(" otherMethod() 종료" ); 
	
	} //main
	
}//class
