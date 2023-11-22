package days26;

import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex05 {
		// [ PipedReader ]
		// [ PipedWriter ]
		//	-스레드간 데이터 입출력스트림
	
		// [RandomAccessFile]
		//	랜덤		접근	 파일스트림
		// 파일의 어느 위치에나 읽기/쓰기가 가능한 장점이 있는 스트림
		// implements DataOutput, DataInput
		// - seek(위치값) 파일 위치를 지정하는 메서드
		// - getFilePointer() 파일 위치를 찾는 메서드
		// - readxxx()
		// - writexxx()
	
	public static void main(String[] args) throws IOException {
		String s = "I Love narmal Java";
		String q = "javabook";	
		
		String name =".\\src\\days26\\random.txt";
		String mode = "rw"; //읽기,쓰기 모두 사용
		try (RandomAccessFile raf =new RandomAccessFile(name, mode)){
			long cp = raf.getFilePointer();
			raf.writeBytes(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//일시정지 . Enter 입력시 진행
		System.out.println(">Enter입력시 진행");
		System.in.read();
		System.in.skip(System.in.available()); //13,10제거
		
		try (RandomAccessFile raf =new RandomAccessFile(name, mode)){
			//임의의 위치로 이동 > 쓰기
			raf.seek(7);
			raf.writeBytes(q);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//일시정지 . Enter 입력시 진행
		System.out.println(">Enter입력시 진행");
		System.in.read();
		System.in.skip(System.in.available()); //13,10제거
		
		try (RandomAccessFile raf =new RandomAccessFile(name, mode)){
			//임의의 위치로 이동 > 읽기
			raf.seek(2);
			String line = raf.readLine();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}//main
}//class
