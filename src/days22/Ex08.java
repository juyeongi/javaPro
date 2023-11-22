package days22;

public class Ex08 {
	public static void main(String[] args) {
//		LinkedList 컬렉션클래스
//		1. 배열 : 메모리상에 동일한 자료형을 연속적으로 놓이게 한 것
//			1)장점 : 읽기성능이 가장 빠름
//			2)단점 : 배열크기x, 삽입,삭제의 속도가 느림
//
//		2. LinkedList : 비연속적
//			1) ArrayLIst, Vector + <E>(=element = 요소)
//			2)Node (노드)
//				각 노드들은 연결되어져있음
//					[Node]				[0x400Node]	[0x200Node]
//					0x100					0x200			0x300
//							[0x100Node]		중간에 노드가 추가될 때 주소값이 알아서 바뀜
//								0x400
//				단방향 링크드리스트 : 앞 노드의 주소값을 가지고있음
//				양방향(더블) 링크드리스트 : 앞뒤 노드의 주소값을 다 가지고있음
//				환형 링크드리스트 : 마지막 노드가 첫번째노드의 주소값을 가지고 있음(안정감)
			Node node1 = new Node();
			node1.value =10;
			
			Node node2 = new Node();
			node2.value =20;
			node1.next=node2;
			
			Node node3 = new Node();
			node3.value =30;
			node2.next=node3;
			
			Node node4 = new Node();
			node4.value =40;
			node3.next=node4;
			
			//노드 2,3 사이에 삽입
			Node node5=new Node();
			node5.value =50;
			node2.next = node5;
			node5.next = node3;
			
			//노드3삭제
			node5.next = node4;
			
			//node4 삭제
			node5.next=null;
			
			
	}//main
}//class

class Node{
	int value;
	Node next =null;	//다음 노드의 주소 참조 필드
//	Node prev =null;	//이전 노드의 주소 참조 필드
}