package days22;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03_02 {
	public static void main(String[] args) {
		
//		  1) 팀원들의 이름을 요소로 추가 
		ArrayList list = new ArrayList();

		list.add("박정호");
		list.add("이상문");
		list.add("이주영");
		list.add("정하영");
		list.add("이동현");
		list.add("주강민");
		
//		  2) 반복자를 사용해서 모든 요소(팀원들) 출력 
		dispList(list);
		
//		  3) 팀원들의 인원수를 출력
		System.out.println(list.size()); //요소의 갯수
		
//		list.trimToSize(); //[][][][]...남는 요소 방갯수 삭제
		
//		  4) 두 번째 팀원이 누구인지 확인 후 "홍길동" 팀원으로 수정
		
		String name = (String) list.get(1);		//list.get Object >String으로 다운캐스팅
		System.out.println(name);
//		list.remove(1);
//		list.add(1, "홍길동");
		list.set(1, "홍길동");
		System.out.println(list);
		
//		  5) "홍길동" 팀원의 존재 유무를 확인 후 삭제
		//list.contains("홍길동"));
		int index = list.indexOf("홍길동");
		list.remove(index);	//삭제된 요소가(홍길동) 반환(리턴값)

//		  6) "김"씨 팀원들만 삭제 후 확인.
		
		/*
		String regex="김.+";
		name.charAt(0)=='김';
		name.startsWith("김");
		*/
		
	}
		
	private static void dispList(ArrayList list) {
		Iterator ir =list.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			System.out.println(name);
		}
	}
	
}
