package days21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Ex14 {
	public static void main(String[] args) {
//		1조
//		이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준 
//		2조
//		박민석, 유희진, 고경림, 임경재(팀장), 이지현 , 김정주, 김호영
//		3조
//		박정호(팀장), 이상문, 이주영, 정하영, 이동현, 주강민
//
		ArrayList team1 = new ArrayList();
//		System.out.println(team1.size()); //size() : 요소의 갯수
		String t1 ="이경서(팀장), 신종혁, 이재영, 송해영 , 신기범, 이준희, 김성준";
		t1=t1.replaceAll("\\(팀장\\)", ""); //()정규표현식의 ()로 인식되어 지워지지않음
														//  \\  \\ ()가 문자열임을 표기
//		t1=t1.replace("(팀장)", "");
		String [] t1Arr =t1.split("\\s*,\\s*");
		for (int i = 0; i < t1Arr.length; i++) {
			team1.add(t1Arr[i]);
		} //	for
		//System.out.println(team1);
		
		ArrayList team2 = new ArrayList(10);
		team2.add("박민석");
		team2.add("유희진");
		team2.add("고경림");
		
		ArrayList team3 = new ArrayList(10);
		team3.add("박정호");
		team3.add("이상문");
		team3.add("이주영");
		
		ArrayList class5 = new ArrayList(team1);
		class5.addAll(team2);
		class5.addAll(team3);
		System.out.println(class5);
		
		//iiterator () class5 모든 요소출력
		
		Iterator ir =class5.iterator();
		while (ir.hasNext()) {
			String name = (String) ir.next();
			//System.out.println(name);
		}		
		System.out.println(class5.containsAll(team1));
		
		//class5 이름 오름차순 정렬
		//원본유지. 복제본 수정 삭제 추가
		ArrayList class5Clone =(ArrayList)class5.clone();
		class5Clone.removeAll(team1);
		System.out.println(class5);
		//2,3조
		System.out.println(class5Clone);
		//이름 오름차순 정렬
		//sort()		정렬할 때 기준이되는 comparator 비교기 필요 
		class5Clone.sort(new Class5Comparator() );
		System.out.println(class5Clone);
		
	}//main
}//class

class Class5Comparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//o1 instanceof String
		String s1=(String)o1;
		String s2=(String)o2;
		
		return s1.compareTo(s2);
		
//		return s2.compareTo(s1);   //내림차순
	}
}
