package days23;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex05 {

	public static void main(String[] args) {
		//Set : HashSet, LinkedHashSet
		//		[TreeSet]
		//	1. 중복허용 x, 순서유지 x
		//	2. 이진 검색트리라는 자료구조로 데이터를 저장하는 컬렉션클래스
		//	3. 이진 검색트리>> 검색, 정렬, 범위검색하는데에 성능이 높음
		//	4. LinkedList처럼 node가 서로 연결된 구조
		//	5. 최상위 노드 : 루트(root)노드 
		//		부모- 자식 노드관계
		//		형제 노드관계
		//	6. 트리노드
		//		class TreeNode{
		//				TreeNode left ;  // 왼쪽 자식노드
		// 				Object element;
		//				TreeNode right; // 오른쪽 자식노드
		//				}
		//왼쪽 자식노드의 값<부모노드의 값<오른쪽 자식노드의 값
		//노드의 추가 삭제에 시간이 걸린다.(순차적으로 저장하지 않으므로)
		//모든 노드는 최대 두 개의 자식노드를 가질 수 있다.
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		ts.add(5);
		ts.add(6);
		//[1, 4, 5, 6, 7, 9]
		System.out.println(ts);
		//정렬된 순서에서 첫번째, 마지막 값 반환
		System.out.println(ts.first());	//1
		System.out.println(ts.last());	//9
		SortedSet<Integer> ss = ts.subSet(4, 7);
		System.out.println(ss);	//[4, 5, 6]
		//지정된 값(객체)보다 큰 값 중 가장 가까운 값 ㅂ나환 
		System.out.println(ts.higher(1));	//4 
		System.out.println(ts.lower(4));	//1
		
		//지정된 값과 같은 객체를 반환
		//트리구조에 지정된 값이 없으면 보다 작은 값중 가장 가까운 값 반환
		// != null 반환
		System.out.println(ts.floor(3));		//1
		System.out.println(ts.ceiling(3));	//4
		
	}//main

}//class
