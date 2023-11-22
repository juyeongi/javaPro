package days27;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Ex01_02 {
		// [ 역직렬화 ]	: Stream > 객체 변환

	public static void main(String[] args) {

		String pathname = ".\\src\\days27\\Child.ser";
		
		try (FileInputStream in = new FileInputStream(pathname);
				ObjectInputStream ois = new ObjectInputStream(in);) {
			

			Child c = (Child) ois.readObject();

			System.out.println(c.name);
			System.out.println(c.age);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}//class
