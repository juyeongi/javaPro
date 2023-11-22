package days14;

public class Ex11 {
	public static void main(String[] args) {
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document("자바문서.txt");
		Document doc4 = new Document();
		Document doc5 = new Document();
		
	}//main
}//class

//			문서
class Document{
	String fileName;
	static int count=1;
	
	{
		count++;
		System.out.println("인스턴스 초기화 블럭 실행");
	}
	
	public Document(){
		//Constructor call must be the first statement in a constructor
		/*
		String fileName = String.format("Noname%d.txt" , count);
		this(fileNmae);
		*/
		//Cannot refer to an instance field count while explicitly invoking a constructor
		//명시적 호출에서 count 참조 불가능, static으로 변경
		this(String.format("Noname%d.txt" , count));
	}
	public Document(String fileName){
		this.fileName = fileName;
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n", this.fileName);
		
	}
}//Document