package days16;

public class Ex11_02 {
	public static void main(String[] args) {
		//인터페이스 static 메서드
		//Parsealbe.method1();
		
		String paringFile = "hello.xml";
		String docType = "xml";
		
		Parseable parser = ParserManager.getParser(docType);
		parser.parse(paringFile);
		//5년 뒤 파싱+출력(인쇄)기능
		parser.print();
	}//main
}//class

interface Parseable{
				//구문분석
	void parse(String fileName); //구문 분석할 파일
	
	//
	default void print() {
		System.out.println("각각 parser에서 각자의 인쇄기능 구현");
	};
	
	//static 메서드
	static void method1() {
		System.out.println("기본 코딩");
	}
}

class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println(">XML파일 구문 분석코딩");
	}
	
}
class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println(">파일 구문 분석코딩");
	}
	
}

class ParserManager{
	//리턴자료형 (Parseable) 인터페이스 다형성
	public static Parseable getParser (String docType) {
		if (docType.equals("xml")) {
			return new XMLParser();
		}else if (docType.equals("html")) {
			return new HTMLParser();
		}else { 
			return null;
		}
	}			
	
		
}