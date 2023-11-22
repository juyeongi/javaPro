package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10 {
	
	public static void main(String[] args) throws IOException {
		
		
		// 나이 정수 (0~125) ==> byte
		
		byte age = 20; //byte,short, int,long (정수)= %d 
				
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print(">나이를 입력하세요");
		
		//Type mismatch: cannot convert from String to byte : br.readLine은 String 전용
		String inputData = br.readLine();
		
		byte b = Byte.parseByte(inputData);
		System.out.printf(">나이는 %d살입니다.", age);
		
				
	}//main

}//class
