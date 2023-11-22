package days18;

public class Ex06 {
	public static void main(String[] args) {
		//Object.clone() 복제
		
		Person p1 = new Person ( "111","홍길동" );
		//p1.clone(); // 복제Ex03_02
		Person p1Clone; // Person
		p1Clone = p1.clone();
		System.out.println(p1Clone); 
		
		//[1]
		/*
		//[clone () 오버라이딩 불편한 점 
		//(person) 다운캐스팅
		
		try {//checked 예외처리
			p1Clone = (Person)p1.clone(); //다운캐스팅
			System.out.println(p1Clone);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} //다운캐스팅
		*/
		/*
		p1.notify();
		p1.notifyAll();
		p1.wait();
		p1.wait();
		p1.wait();
		*/
		//p1.finalize();	소멸자 (<->생성자)
		
		
	}//main
}//class
