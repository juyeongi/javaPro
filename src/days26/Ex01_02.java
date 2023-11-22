package days26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.MessageFormat;
import java.util.Arrays;

public class Ex01_02 {
//			[DataInputStream]
//			[DataOutputStream]
//			-기본형 8가지를 읽기/쓰기가 가능한 바이트스트림
	public static void main(String[] args) {
		String name;
		int kor, eng, mat ;
		int tot ;
		double avg;
		boolean gender;
		//student.txt  불러오기
		String fileName= ".\\src\\days26\\student.txt";
		
		try(FileReader in = new FileReader(fileName);
		BufferedReader br = new BufferedReader(in)) {
			String line = br.readLine();
			//홍길동,87,79,80,246,82.000000,true
			//MessageFormat 형식화 클래스 사용
			String pattern = "이름 : {0}, 국어: {1}, 영어: {2}, 수학: {3}, 총점: {4}, 평균: {5}, 성별: {6}";
			MessageFormat mf =new MessageFormat(pattern);
			Object[] datas = mf.parse(line);
			//object [] > Stream > String [] 변환
			String []s=Arrays.asList(datas).toArray(new String[datas.length]);
			name = s[0]; 
			kor = Integer.parseInt(s[1]);
			eng = Integer.parseInt(s[2]); //예외발생
			mat = Integer.parseInt(s[3]); //nul값으로 반환
			avg = Double.parseDouble(s[5]);
			gender = Boolean.parseBoolean(s[6]);

			/*
			//String = object
			//Type mismatch: cannot convert from Object to String
			name = (String) datas[0]; //cast연산자로 형변환
			//object > int 변환불가.  object > String > int
			kor = Integer.parseInt((String) datas[1]);
			eng = Integer.parseInt( datas[2].toString()); //예외발생
			mat = Integer.parseInt( String.valueOf(datas[3])); //nul값으로 반환
			
			avg = Double.parseDouble(datas[5].toString());
			gender = Boolean.parseBoolean(datas[6].toString());
			*/
			System.out.printf("%s,%d,%d,%d,%f,%b\n",name, kor,eng,mat,avg,gender);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}//main
}//class
