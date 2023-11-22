package days26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Ex02_02 {
//			[DataInputStream]
//			[DataOutputStream]
//			-기본형 8가지를 읽기/쓰기가 가능한 바이트스트림
	public static void main(String[] args) {
		String name;
		int kor, eng, mat ;
		int tot ;
		double avg;
		boolean gender;
		//한 학생의 정보를 student[.txt]파일에 저장
		//FileWriter 문자파일스트림
		//BufferedWriter 문자보조스트림
		String fileName= ".\\src\\days26\\student.dat"; //.dat : data를 나타내는 확장자, .ini : 초기설정값
																		
		try (FileInputStream in = new FileInputStream(fileName);
				DataInputStream dis = new DataInputStream(in)) {
			name=dis.readUTF();
			kor=dis.readInt();
			eng=dis.readInt();
			mat=dis.readInt();
			tot=dis.readInt();
			avg=dis.readDouble();
			gender=dis.readBoolean();
			
			System.out.printf("%s,%d,%d,%d,%f,%b\n",name, kor,eng,mat,avg,gender);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}//main
}//class
