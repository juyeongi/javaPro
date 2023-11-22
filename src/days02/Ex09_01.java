package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex09_01 {

	
	public static void main(String[] args) throws IOException {
		
		String name = "이주영";
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.print(">이름을 입력하세요");
		name = br.readLine();
		
		System.out.printf(">이름 : %s\n");
	}
		
		

}
