package days05;

public class Ex03 {
	
	public static void main(String[] args) {
		//ASCII 256가지
		//문제) 한 라인에 10개씩 출력
		//문제) 라인 번호 붙이기
		
		//for (int i = 0; i < 256; i++) {
			//System.out.printf("%d-%c\n", i, (char)i);
			//System.out.printf("[%c]", (char)i);
		/*	
			System.out.printf("[%c]", (char)i);
			if (i%1-==0) {
		    }i=0 이 초기식에 선언되고 if문이 선언됨
		    
		    if (i%1-==0) {
		    }
		    System.out.printf("[%c]", (char)i);
		    
		    */
			//[
			//][][][
			//]
		    //ASCII 10 개행  '\n' LineReed(LF) : 새 줄로 이동 (바로 아래줄 같은 위치)
			//ASCII 13 개행  '\r' CarrageReturn(CR) : \n작업된 커서를 줄 맨 앞으로 이동
			//엔터==개행==\n\r
			for (int i = 0, lineNumber =1; i<256 ;i++) {
			
			
				//if (1%10 == 0 ) System.out.printf("%d : ", i/10+1); //원래 0부터 시작돼서 +1로 1번시작
				if (i%10 == 1 ) System.out.printf("%d : ", lineNumber++); //원래 0부터 시작돼서 +1로 1번시작
				System.out.printf("[%c]", (char)i);
				if (i%10==9) { //0부터 시작되어 0~9,10~19,... 
				System.out.println();
			    }//if
			}//for	
	
		
	}//main

}//class
