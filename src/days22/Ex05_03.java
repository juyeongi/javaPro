package days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ex05_03 {
//		5. 이름, 나이 필드를 가진 Person3 클래스를 선언하고
//	   ArrayList 컬렉션 클래스에  Person3 객체를 요소로 추가하고 
//	   이름으로 오름차순 정렬해서    출력하는 코딩을 하세요 ..    
	public static void main(String[] args) {
		
		ArrayList<Person3> list = new ArrayList();
		list.add(new Person3("홍길동", 20));
		list.add(new Person3("고길동", 21));
		list.add(new Person3("김둘리", 22));
		list.add(new Person3("이또치", 23));
		list.add(new Person3("마이클", 24));
		
		System.out.println(list);
		
		list.sort(null);	//비교기 클래스로 선언

		//반복자 출력
		Iterator ir=list.iterator();
		while (ir.hasNext()) {
			Person3 p	 = (Person3 ) ir.next();
			System.out.println(p);
			
		}
		
		
	}
}


//비교기 있는 클래스 선언 
//comprator 비교기 x

class Person3 implements Comparable{
	private String name;
	private int age;
	
	public Person3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person3(String name, int age) {
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
		return "Person3 [name=" + name + ", age=" + age + "]";
	}
	

	//비교기능이 있는 클래스로 변환
		@Override
		public int compareTo(Object o) {
			Person3 p = (Person3) o;
			return this.getName().compareTo(p.getName());
		}
}
