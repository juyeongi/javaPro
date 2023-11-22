package days16;

public class Ex06 {
	public static void main(String[] args) {
		//[Singleton pattern]
		/*
		1. DBCP(DataBaseConnectionPool)
		2. 객체 생성 제한 - [1개 객체 생성]
				첫번째 객체 생성	-객체생성
				두번째 객체 생성	-생성x
				세번째 객체 생성	-생성x
		*/
		/*
		 *접근지정자 private로 지정 
		//The constructor BoardDao() is not visible
		//디폴트생성자가 없기때문에 객체생성 불가능 (new 연산자 불가능)
		BoardDao dao1 = new BoardDao();
		System.out.println(dao1.hashCode());
		BoardDao dao2 = new BoardDao();
		System.out.println(dao2.hashCode());
		BoardDao dao3 = new BoardDao();
		System.out.println(dao3.hashCode());
		BoardDao dao4 = new BoardDao();
		System.out.println(dao4.hashCode());
			1521118594
			1940030785
			1869997857
			1763847188
			객체 여러개 출력
		*/
		
		BoardDao dao1 = BoardDao.getInstance();
		System.out.println(dao1.hashCode());
		BoardDao dao2 = BoardDao.getInstance();
		System.out.println(dao2.hashCode());
		BoardDao dao3 = BoardDao.getInstance();
		System.out.println(dao3.hashCode());
		BoardDao dao4 =  BoardDao.getInstance();
		System.out.println(dao4.hashCode());
	
	}//main
}//class
//1개객체만 생성패턴
//클래스 내부에서 객체생성가능(private접근지정자 클래스 내에서만 접근가능)
class BoardDao extends Object{
	private BoardDao() {
		
	}
	//자기자신 객체를 저장하는 필드
	//공유변수, 클래스변수 [static]
	private static BoardDao boardDao = null; 
	//메서드앞에 synchronized키워드가 붙으면
	//해당 메서드는 스레드에 안전한 동기화처리가 되어짐
	public synchronized static BoardDao getInstance() { //getinstance 객체생성후 가져오는함수
		if (boardDao==null) {
			boardDao = new BoardDao();
		}//if
		return boardDao;
	}
	
}