package days18;

public class Ex07 {
	public static void main(String[] args) {
		//	[객체로부터 객체의 정보를 가지고 있는 Class 객체를 얻어오는 3가지 방법]
		//이유> 객체가 어떤 클래스로부터 생성되었는지 파악 후 클래스정보로 얻어와서 활용할 목적
		//[1]Object 에서 물려받은 getClass () 메서드 통해
		/*
		Card card1 = new Card ("HEART",3);
		Class cls = card1.getClass();
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		*/
		
		
		//[2] 모든 클래스명.class  ==클래스변수 재공
		/*
		Class cls = Card.class ; 
		System.out.println(cls);  //class days18.Card
		
		// =>Class cls 얻어와서 객체 생성
		//try.catch 예외처리
		Card card2 = (card2)cls.newInstance();
		*/
		
		//[3] class클래스의 static 메서드
		
		String className = "days18.Card";
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}//main
}//class

final class Card{
	String kind; //카드종료
	int num; //카드번호
	
	Card(){
		this("SPADE",1);
	}
	Card(String kind, int num){
		this.kind =kind;
		this.num=num;
	}
	@Override
	public String toString() {
		return "Card [kind=" + kind + ", num=" + num + "]";
	}
}