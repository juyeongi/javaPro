package days22;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex03_03 {
	public static void main(String[] args) {
		
//		  1) 팀원들의 이름을 요소로 추가 
		ArrayList list = new ArrayList();

		list.add("박정호");
		list.add("이상문");
		list.add("이주영");
		list.add("정하영");
		list.add("이동현");
		list.add("주강민");
	
//		팀에서 '이'씨 팀원 삭제
							//The method charAt(int) is undefined for the type Object 
		list.removeIf(n->((String) n).charAt(0)=='이');// obj > str 다운캐스팅
		System.out.println(list);
	}
}
