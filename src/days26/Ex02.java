package days26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Ex02 {
//			[DataInputStream]
//			[DataOutputStream]
//			-기본형 8가지를 읽기/쓰기가 가능한 바이트스트림
	public static void main(String[] args) {
		String name="고길동";
		int kor=79, eng=45, mat = 90;
		int tot = kor+eng+mat;
		double avg = (double)tot/3;
		boolean gender = false;
		//한 학생의 정보를 student[.txt]파일에 저장
		//FileWriter 문자파일스트림
		//BufferedWriter 문자보조스트림
		String fileName= ".\\src\\days26\\student.dat"; //.dat : data를 나타내는 확장자, .ini : 초기설정값
																		
		try (FileOutputStream out = new FileOutputStream(fileName, true);
				DataOutputStream dos = new DataOutputStream(out)) {
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}//main
}//class
