package days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ex05_02 {
//		5. 이름, 나이 필드를 가진 Person2 클래스를 선언하고
//	   ArrayList 컬렉션 클래스에  Person2 객체를 요소로 추가하고 
//	   이름으로 오름차순 정렬해서    출력하는 코딩을 하세요 ..    
	public static void main(String[] args) {
		
		ArrayList<Person2> list = new ArrayList();
		list.add(new Person2("홍길동", 20));
		list.add(new Person2("고길동", 21));
		list.add(new Person2("김둘리", 22));
		list.add(new Person2("이또치", 23));
		list.add(new Person2("마이클", 24));
		
		System.out.println(list);
		
		list.sort((p1,p2)->p1.getName().compareTo(p2.getName()));

		//반복자 출력
		Iterator ir=list.iterator();
		while (ir.hasNext()) {
			Person2 p	 = (Person2 ) ir.next();
			System.out.println(p);
			
		}
	}
}

class Person2 {
	private String name;
	private int age;
	public Person2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	
	
}
