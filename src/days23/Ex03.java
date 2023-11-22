package days23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
//		LinkedHashSet컬렉션클래스
//		중복허용x 순서유지 o
	
		//Person 객체가 중복되지 않도록 하기위해 LinkedHashSet 사용
		// ex) List<Person> p = new ArrayList<Person>();
		//인터페이스로 받을 수 있음. 부모인터페이스에 업캐스팅
		Set<Person> s=new LinkedHashSet<Person>();
		s.add(new Person("111111-1111111","김호영",20));
		s.add(new Person("222222-2222222","박민석",21));
		s.add(new Person("333333-3333333","박정호",22));
		
		System.out.println(s.size());//3
		//주민등록번호가 같으면 같은 객체, 중복x
		s.add(new Person("222222-2222222","박민석",35));

		Iterator<Person> ir = s.iterator();
		while (ir.hasNext()) {
			Person p =ir.next();
			System.out.println(p);	
		}//while
	}//main
}//class
class Person{
	String rrn;
	String name;
	int age;
	
	
	public Person() {
		super();
	}
	
	public Person(String rrn, String name, int age) {
		super();
		this.rrn = rrn;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [rrn=" + rrn + ", name=" + name + ", age=" + age + "]";
	}
	
	//주민등록번호가 같으면 같은 객체, 중복x
	//hashcode()   rrn 오버라이딩
	//equals()		rrn 오버라이딩

	@Override
	public int hashCode() {
		return this.rrn.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person)obj;
			return this.rrn.equals(p.rrn);
		}
		return false;
	}
	
}//Person