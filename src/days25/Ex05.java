package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class Ex05 {
	public static void main(String[] args) throws IOException {
//		 [자바 입출력(IO)]
		/*
		 * 1. IO = Input + Output
		 * 									= 입출력
		 * 2. 	[컴퓨터(프로그램)]<-->[외부장치(프로그램)]
		 * 		프로그램간 데이터를 주고받는 것
		 * 3. 두 장치의 송수신을 위해 연결해주는 객체 필요 : 스트림(stream)
		 * 4. 스트림 (stream) : 데이터를 운반하는 통로
		 * 			1) 흐르는 물(사전적)
		 * 			2) 단방향
		 * 				 (1) 읽기(입력용) 스트림
		 * 				 (2) 쓰기(출력용) 스트림				  
		 * 5. 연속적인 데이터의 흐름
		 * 6. 자바의 모든 입출력은 스트림(stream)이라는 개념으로 이루어짐
		 * 7. ex)
		 * 		키보드		->수신>  [프로그램처리]  ->송신->	모니터
		 * 	(표준입력장치)					 기준					(표준출력장치)
		 * 				System.in(스트림)			System.out(스트림)
		 * 8. 자바의 스트림 2가지 종류 구분
		 * 		1) 문자(텍스트) 스트림
		 * 			최상위 부모클래스 : Reader	(입력용스트림) (xxxReader) 
		 * 			최상위 부모클래스 : Writer	(출력용스트림) (xxxWriter)
		 *				FileReader 	: 문자단위로 처리하는 입력용스트림
		 *				FileWriter	: 문자단위로 처리하는 출력용스트림
		 *				BufferedReader	: 문자단위로 처리하는 입력용스트림 (라인 단위 처리)
		 *				BufferedWriter	: 문자단위로 처리하는 출력용스트림 (라인 단위 처리)
		 * 		2) 바이트(이진) 스트림
		 * 			최상위 부모클래스 : InputStream	(입력용스트림) (xxxInputStream)
		 * 			최상위 부모클래스 : OutputStream	(출력용스트림) (xxxOutputStream)
		 * 				바이트, 바이트배열, 정수(int)를 바이트값으로 처리 ( 1바이트 == 8비트 )
		 * 
		 *				InputStream is = System.in;	//바이트스트림
		 *				int nextByte = System.in.read();	//0~255 문자열 끝을 만나면 -1
		 *				FileReader				:파일 읽기(입력용) 문자스트림
						Filewriter				:파일 쓰기(출력용) 문자스트림
						FileInputStream		:파일 읽기(입력용) 바이트스트림
						FileOutputStream	:파일 쓰기(출력용) 바이트스트림
		 * 9. 보조스트림 : 어떤 스트림의 IO를 더 쉽도록 보조역할을 하는 스트림
		 * 					  BufferedReader / BufferedWriter
		 */
		
		
		
		
	}
}
