package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.stream.Stream;

import days25.Ex03.Direction;

public class Ex08_02 {
	public static void main(String[] args) throws IOException {
		String source = "package days25;\r\n"
				+ "\r\n"
				+ "public class Ex03 {\r\n"
				+ "	//				 			0			1			2		3		순서\r\n"
				+ "//	enum Direction  {EAST, SOUTH, WEST, NORTH}\r\n"
				+ "//	enum Direction  {EAST=100	, SOUTH=2==, WEST, NORTH}\r\n"
				+ "     //		ㄴ문법에러\r\n"
				+ "	\r\n"
				+ "	//The constructor Ex03.Direction(int) is undefined\r\n"
				+ "	enum Direction  {\r\n"
				+ "		EAST(100,	\"▶\"), SOUTH(200,\"▼\"), WEST(300,\"◀\"), NORTH(400,\"▲\");\r\n"
				+ "	\r\n"
				+ "		private final int value;\r\n"
				+ "		private final String symbol;\r\n"
				+ "		/*\r\n"
				+ "		Direction(int value){\r\n"
				+ "		 this.value= value;\r\n"
				+ "		}\r\n"
				+ "		*/\r\n"
				+ "		Direction(int value, String symbol){\r\n"
				+ "			this.value = value;\r\n"
				+ "			this.symbol =symbol;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		public String getSymbol() {\r\n"
				+ "			return symbol;\r\n"
				+ "		}\r\n"
				+ "\r\n"
				+ "		public int getValue() {\r\n"
				+ "			return value;\r\n"
				+ "		}\r\n"
				+ "		\r\n"
				+ "	}\r\n"
				+ "	\r\n"
				+ "	public static void main(String[] args) {\r\n"
				+ "		\r\n"
				+ "//		[ 열거형에 멤버 ( 필드 , 메서드 , 생성자  )추가 ]\r\n"
				+ "		/*\r\n"
				+ "		 * 1.enum Direction  {EAST, SOUTH, WEST, NORTH}\r\n"
				+ "		 * 2.컴파일러가 클래스 변환\r\n"
				+ "		 * 		class Direction extends Enum{\r\n"
				+ "		 * 			static final EAST = new Direction (\"East\");\r\n"
				+ "		 * 			static final SOUTH = new Direction (\"SOUTH\");\r\n"
				+ "		 * 			static final WEST = new Direction (\"WEST\");\r\n"
				+ "		 * 			static final NORTH = new Direction (\"NORTH\");\r\n"
				+ "		 * \r\n"
				+ "		 * 			private String name;\r\n"
				+ "		 * 			public int namename(){\r\n"
				+ "		 * 				return this.name;\r\n"
				+ "		 * 			}\r\n"
				+ "		 * 			private int ordinal;\r\n"
				+ "		 * 			public int ordinal(){\r\n"
				+ "		 * 				return this.ordinal;\r\n"
				+ "		 * 			}		\r\n"
				+ "		 * 			private Direction(String name){\r\n"
				+ "		 * 			this.name =name;\r\n"
				+ "		 * 			}\r\n"
				+ "		 * \r\n"
				+ "		 * 열거형 ordinal()	 메서드에 의해서 열거형 상수를 사용하는데\r\n"
				+ "		 * 상수값은 0,1,2, .. 반환\r\n"
				+ "		 * 내가 원하는 정수값을 설정해서 사용할 수 없음\r\n"
				+ "		 * \r\n"
				+ "		 * \r\n"
				+ "		 */\r\n"
				+ "		\r\n"
				+ "		Direction [] dirArr = Direction.values();\r\n"
				+ "		for (Direction dir : dirArr) {\r\n"
				+ "			System.out.println(dir.name()+\"/\"+dir.ordinal()+\"/\"+ dir.getSymbol()+\"/\"+dir.getValue());\r\n"
				+ "		}\r\n"
				+ "	}\r\n"
				+ "}\r\n"
				+ "";
		
		//[문제] source 문자열에서 21번째라인의 문자열을 line21변수에 저장 후 출력 코딩
		/*
		String line = null;
		try(FileReader fr = new FileReader(source);
				BufferedReader br = new BufferedReader(fr)){
			while ((line = br.readLine())!=null) {
				String [] s = 
			}
			
		} catch (Exception e) {
			e.printStackTrace()
		}
		*/
		//[1]
		/*
		String [] datas = source.split("\r\n");
		String line21 =source.split("\r\n")[20];
		System.out.println(line21);
		*/
		
		//[2]라인단위 처리 보조스트림 사용 
		
		// source > xxxReader 문자스트림 > 보조스트림
		StringReader sr = new StringReader(source); //source > 문자메모리스트림
		BufferedReader br = new BufferedReader(sr);
		//br.skip(20);  라인스킵 x 문자 스킵
		String line21 = null;
		int i = 1;
		while (i++<=20) br.readLine();
		line21 =br.readLine();
		System.out.println(line21);
		
		//[3]
		/*
		String [] datas = source.split("\r\n");
		String line21 =Stream.of(datas).skip(20).findFirst().get(); //배열>문자
		System.out.println(line21);
		System.out.println("end");
		*/
	}//main
}//class
