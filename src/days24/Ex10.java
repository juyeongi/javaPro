package days24;

import java.util.ArrayList;

/*
 public class Ex10 {
	
	// [제네릭 클래스]
	public static void main(String[] args) {
		
		//제네릭 객체생성
		Box03<Fruit> fruitBox = new Box03<>();
		Box03<Fruit> appleBox = new Box03<>();
		Box03<Fruit> grapeBox = new Box03<>();
		
		Box03<Fruit> toyBox = new Box03<>();
		
		//Type mismatch: cannot convert from Box03<Grape> to Box03<Apple>
		//	ㄴ타입불일치, 형변환 불가
//		Box03<Apple> box1=new Box03<Grape>();
		
		//Type mismatch: cannot convert from Box03<Fruit> to Box03<Apple>
//		Box03<Apple> box1 = new Box03<Fruit>();
		
		//Type mismatch: cannot convert from Box03<Apple> to Box03<Fruit>
//		Box03<Fruit> box1= new Box03<Apple>();
		
		
		//자식객체는 참조가능
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		//The method add(Fruit) in the type Box03<Fruit> is not applicable for the arguments (Toy)
		// 상속관계까 아닌 객체는 참조불가
//		fruitBox.add(new Toy());
		
		
	}//m
	
}//c
*/
/*
class Fruit{
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

//제네릭클래스 선언
class Box03<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {this.list.add(item);}
	int size () {return this.list.size();}
	T get(int i) { return this.list.get(i);}
	public String toString() {return this.list.toString();}
}
*/