package days26;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Ex07 {
		// [ 직렬화 ]	: 객체 > Stream 변환
		// [ 역직렬화 ]	: Stream > 객체 변환
		// 객체를 직렬화해서 읽기/쓰기를 할 수 있는 바이트스트림
		// ObjectInputStream
		// ObjectOutputStream
		//	- 직렬화가 가능한 클래스로 만들기 위해서
		// 		Serializable 인터페이스구현
	
	public static void main(String[] args) {
		//학생정보 - 번호, 이름, 국,영,수,총점,평균 > 파일저장
		//Student클래스 > s객체(학생정보) > 파일저장
		// [직렬화]
		UserInfo u1 = new UserInfo("김호준", "1234", 25) ;
		UserInfo u2 = new UserInfo("이지현", "4321", 23) ;
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		String pathname = ".\\src\\days26\\UserInfo.ser";
		
		try (FileOutputStream out = new FileOutputStream(pathname);
				ObjectOutputStream oos = new ObjectOutputStream(out);) {
			
			//NotSerializableException 직렬화할 수 없는 예외발생 
			//> UserInfo 클래스에 Serializable 인터페이스구현
			oos.writeObject(u1);
			oos.writeObject(u2);
			oos.writeObject(list);
			
			oos.flush();
			
			System.out.println(">u1,u2,list 객체 직렬화 > oos파일로 저장 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class

//The serializable class UserInfo does not declare 
//a static final serialVersionUID field of type long
class UserInfo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4461614692108077735L;
	String name;
	
	//기타제어자 transient : 직렬화대상제외
	transient String password;		//직렬화대상 제외 
	int age;
	public UserInfo() {
		this("Unknown", "1111", 0);
	}
	public UserInfo(String name, String password, int age) {
		super();
		this.name = name;
		this.password = password;
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", password=" + password + ", age=" + age + "]";
	}
	
	
}