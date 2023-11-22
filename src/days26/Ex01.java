package days26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ex01 {
//			[DataInputStream]
//			[DataOutputStream]
//			-기본형 8가지를 읽기/쓰기가 가능한 바이트스트림
	public static void main(String[] args) {
		String name="고희동";
		int kor=30, eng=49, mat = 55;
		int tot = kor+eng+mat;
		double avg = (double)tot/3;
		boolean gender = true;
		//한 학생의 정보를 student[.txt]파일에 저장
		//FileWriter 문자파일스트림
		//BufferedWriter 문자보조스트림
		String fileName= ".\\src\\days26\\student.txt";
		
		try(FileWriter out= new FileWriter(fileName, true);
		BufferedWriter bw = new BufferedWriter(out)) {
			String data = String.format("%s,%d,%d,%d,%d,%f,%b\n",name, kor,eng,mat,tot,avg,gender);
			bw.append(data);
			bw.flush();
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");

	}//main
}//class
