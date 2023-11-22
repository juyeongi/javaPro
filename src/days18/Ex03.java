package days18;

public class Ex03 {
	public static void main(String[] args) {
		//	[Object 클래스] + 메서드
		/*
		모든 클래스의 최상위 부모클래스
		필드 존재 x
		메서드 11개 존재
		*/
		Item item1 = new Item (10);
		Item item2 = new Item (10); 
		
		System.out.println(item1.equals(item2)); //false :주소값 비교.item1과 주소값이 다름
										//주소값이 같은지 물음
		Item item3 = item1; // 클래스(객체)복사 
		System.out.println(item1.equals(item3)); //true : 클래스복사로 같은 주소값 가짐

		// boolean Object.equals(); // 동일한 객체(instance) 참조 여부 true, false반환 메서드 
		// ㄴ 객체의 주소값에 대한 비교가 아니라 두 객체가 가지고 있는 변수의 값이 같은지 여부를 비교
		
	}//main
}//class

class Item extends Object{
	int value;
	//생성자
	Item (int value){
		this.value=value;
	}//생성자
}