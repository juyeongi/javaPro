package days26;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Ex07_02 {
		// [ 직렬화 ]	: 객체 > Stream 변환
		// [ 역직렬화 ]	: Stream > 객체 변환
		// 객체를 직렬화해서 읽기/쓰기를 할 수 있는 바이트스트림
		// ObjectInputStream
		// ObjectOutputStream
		//	- 직렬화가 가능한 클래스로 만들기 위해서
		// 		Serializable 인터페이스구현
	
	public static void main(String[] args) {
		// [역직렬화]
		String pathname = ".\\src\\days26\\UserInfo.ser";
		
		try (FileInputStream in = new FileInputStream(pathname);
				ObjectInputStream ois = new ObjectInputStream(in);) {
			
			//ois스트림> UserInfo u1 객체 (역직렬화
			UserInfo u1 = (UserInfo) ois.readObject();
			UserInfo u2 = (UserInfo) ois.readObject();
			ArrayList<UserInfo>list = (ArrayList<UserInfo>) ois.readObject();
			
			System.out.println(u1);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class
