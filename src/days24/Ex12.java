package days24;

import java.util.ArrayList;
import java.util.Collections;

import javax.naming.ldap.ExtendedRequest;

public class Ex12 {
	public static void main(String[] args) {
		//	[와일드카드]
		//<?extends ...>
		//<?super ...>
		//<?>
		FruitBox<Fruit>fruitBox = new FruitBox<>();
		FruitBox<Apple>appleBox = new FruitBox<>();
		FruitBox<Grape>gapeBox = new FruitBox<>();
		/*
		Juice juice = Juicer.makeJuice(fruitBox);
		juice = Juicer.makeJuice(appleBox);
		juice = Juicer.makeJuice(gapeBox);
		*/
		
		//makeJuice메서드를 제네릭 메서드로 선언 (수정)
		//일반메서드와 제네릭메서드 호출방법 다름
//		Juice juice = Juicer.makeJuice(appleBox);
		// <Apple> 생략가능 
		Juice juice = Juicer.<Apple>makeJuice(appleBox);
		
		//[제네릭 메서드]
		// -메서드의 함수 선언부에 제네릭타입이 선언된 메서드
		// (함수선언부 >> 함수선언부{함수의 몸체} ({}몸체 앞부분 전체)
		
//		public static<T> Juice makeJuice (FruitBox<?extends Fruit>box) {
		//				  ㄴ제네릭메서드
//		}
		
	}//m
}//c

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
class Box05<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {this.list.add(item);}
	int size () {return this.list.size();}
	T get(int i) { return this.list.get(i);}
	public String toString() {return this.list.toString();}
}

class FruitBox<T extends Fruit> extends Box05<T>{
}

//일반 클래스선언
//매개변수로 과일박스를 주면 쥬스를 만들어서 반환하는 기능이 있는 Juice클래스
class Juice{}
//FruitBox<?extends Fruit>box)	: Fruit 물려받은 자식클래스만 가능
//FruitBox<?super Fruit>box)	: Fruit 부모클래스만 가능
//FruitBox<?>box)	: 제한x 모든 타입 가능

class Juicer{
	// 일반메서드를 제네릭 메서드로 변경
	static <T extends Fruit>Juice makeJuice (FruitBox<T>box) {
		return new Juice() ;
	}
	
	// 일반메서드
	/*
	//											? == 와일드카드							
	static Juice makeJuice (FruitBox<?extends Fruit>box) {
		return new Juice() ;
	}
	*/
	
	//메서드 오버로딩 조건
	//제네릭타입의 매개변수는 오버로딩 성립x
	/*
	static Juice makeJuice (FruitBox<Fruit>box) {
		return new Juice() ;
	}
	static Juice makeJuice (FruitBox<Apple>box) {
		return new Juice() ;
	}
	static Juice makeJuice (FruitBox<Grape>box) {
		return new Juice() ;
	}
	*/
}






