package days25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex08 {
	// [ 메모리스트림]
	/*
	 * 주로 다른 곳에 입,출력하기 전에 메모리상에 데이터를 임시로 저장할 목적으로 사용하는 스트림
	 * -Byte		ByteArrayInputStream / ByteArrayOutputStream
	 * -char		CharArrayInputStream / CharArrayOutputStream
	 * -String	StringArrayInputStream / StringArrayOutputStream	****
	 */
	public static void main(String[] args) throws IOException {
		byte [] buf = {0,1,2,3,4,5,6,7,8,9};
		//byte[] > bais > while 반복 읽기 > baos > byte[]
		
		//입력(읽기)용 메모리 바이트스트림
		ByteArrayInputStream bais = new ByteArrayInputStream(buf);
		ByteArrayOutputStream baos = new ByteArrayOutputStream()	;
		int code;
		while ((code=bais.read())!=-1) {
			System.out.println(code);
			baos.write(code);
		}//while
		byte [] outbuf = baos.toByteArray();
		System.out.println(Arrays.toString(outbuf));
		bais.close();
		baos.close();
	}//main
}//class
