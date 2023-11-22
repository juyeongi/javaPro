package days27;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex01 {
	// [ 직렬화 ]	: 객체 > Stream 변환
	public static void main(String[] args) {

		Child c = new Child();
		c.name = "홍길동";
		c.age=20;
		String pathname = ".\\src\\days27\\Child.ser";
		
		try (FileOutputStream out = new FileOutputStream(pathname);
				ObjectOutputStream oos = new ObjectOutputStream(out);) {

			oos.writeObject(c);
			oos.flush();
		
			System.out.println(">c 객체 직렬화 > oos파일로 저장 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

//1. 부모클래스를 직렬화할 수 있는 implements Serializable 클래스로 선언 
// > 자식클래스도 직렬화클래스 됨
/*
class Parent implements Serializable{
	String name;
	
}
//child 자식객체를 직렬화
class Child extends Parent{
	int age;
	
}
*/
//2.child 자식객체를 직렬화
class Parent {
	String name;	
}

class Child extends Parent implements Serializable{
	int age;
	//개발자가 직접 부모의 멤버를 직렬화대상에 추가되도록 구현
	private void writeObject(ObjectOutputStream out ) throws IOException {
		out.writeUTF(name); // 직접 직렬화대상에 부모멤버 추가
		out.defaultWriteObject();
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name= in.readUTF();
		in.defaultReadObject();
	}
}



