package days24;

import java.util.ArrayList;

public class Ex11 {
	/*
	public static void main(String[] args) {
		//	[제한된 제네릭클래스]
		// T 모든 타입이 아닌 과일타입 제한해서 제네릭클래스 생성
		FruitBox<Fruit>box1 = new FruitBox<Fruit>();
		FruitBox<Apple>box3 = new FruitBox<Apple>();
		FruitBox<Grape>box2 = new FruitBox<Grape>();
		
		//Bound mismatch: The type Toy is not a valid substitute for the bounded parameter <T extends Fruit> 
		//of the type FruitBox<T>
//		FruitBox<Toy>box4 = new FruitBox<Toy>();
	}//m
	*/
}//c
/*
interface Eatable{}

class Fruit implements Eatable{
	public String toString() {return "Fruit";}
}
class Apple extends Fruit{
	public String toString() {return "Apple";}
}
class Grape extends Fruit{
	public String toString() {return "Grape";}
}
class Toy{
	public String toString() {return "Toy";}
}

//상자 (Box04) 제네릭클래스 선언
class Box04<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {this.list.add(item);}
	int size () {return this.list.size();}
	T get(int i) { return this.list.get(i);}
	public String toString() {return this.list.toString();}
}

//과일만 담을 수 있는 Box 제네릭클래스로 제한 선언

//class FruitBox<T extends Fruit> extends Box04<T>{
//						ㄴ<> ㅇ제한 선언		
//필드 추가선언
//재정의 함수
//}
class FruitBox<T extends Fruit& Eatable> extends Box04<T>{
//						ㄴ Fruit클래스의 자식클래스 && Eatable 인터페이스구현
//							& 기호로 연결
}

*/
