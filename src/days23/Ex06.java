package days23;

import java.io.ObjectOutputStream.PutField;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * 	[Map 인터페이스를 구현한 컬렉션클래스]
		 * 1. key + value 한 쌍으로 관리
		 * 2. Entry(엔트리) = key + value 한 쌍
		 * 		EntrySet()
		 * 3. key 중복허용 x
		 *		value 중복허용 o
		 * 4. HashMap(신ver.)	:동기화처리x	(arraylist)===관계와 비슷함
		 * 		Hashtable(구ver.)	:동기화처리o	(vector)===
		 *	5. HashMap 사용 권장
		 *	6. 해싱(Hashing)
		 *		- 해시함수(hash function)를 이용해서 데이터를 해시테이블(hash table)에 저장하고 검색하는 기법
		 *		-	ㄴ 데이터가 저장되어있는 곳을 알려주는 함수
		 *		-데이터를 빠르게 찾을 수 있음
		 *		-데이터저장 (key+value) 	키를 해시함수에 넣으면 함수가 배열의 한 요소를 얻어오고
		 *										다시 그 배열에 연결된 LinkedList에 데이터를 저장하는 방식
		 *
		 *			Ex)
		 *		[1900]		[][][][][][]
		 *			:
		 *		[1998]		[][][삽입][][]
		 *			ㄴ 위치를 찾는 것 hash
		 *		[2000]		[][][][]	..
		 */
//						ID		 name
		//HashMap<String, String>	hm= new HashMap<String, String>();
		Hashtable<String, String>	hm= new Hashtable<String, String>();
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		System.out.println(hm);
		
		//key 중복x  : 에러발생x 새로운 value로 저장
		hm.put("hong", "홍중복");
		System.out.println(hm);
		
		hm.put("root", "관리자");
		System.out.println(hm);
		
		System.out.println("-".repeat(40));
		
		//모든 key값 조회 - keySet();
		Set<String> kSet =hm.keySet();
		
		Iterator<String> ir = kSet.iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			System.out.println(key);	
		}
		System.out.println("-".repeat(40));
		
		//true/ false반환 hm.containsKey("hong");
		//true/ false반환 hm.containsValue("홍중복");
		
		String value = hm.get("root");
				value = hm.getOrDefault("kim", "익명"); //"kim"이 없으면 "익명" 출력
//				>hong:홍중복
//				>root:루트
//				>admin:관리자
				hm.replace("root", "관리자", "루트");
				
				
		//모든 value값 조회
		Collection<String> vSet = hm.values();
		Iterator<String> ir2 = vSet.iterator();
		while (ir2.hasNext()) {
			 value = ir2.next();
			System.out.println(value);
		}//while
		System.out.println("-".repeat(40));
		
		//root키를 알 때 value 조회
		String key = "admin";
		 value = hm.get(key);
		System.out.println(value);
		System.out.println("-".repeat(40));
		
		dispHm(hm);
	}//main
	
	//private static void dispHm(HashMap<String, String> hm) {
	private static void dispHm(Hashtable<String, String> hm) {
		//key : value
//		hong:홍중복
//		root:관리자
//		admin:관리자
		
		Set<Entry<String, String>> eSet = hm.entrySet();
		Iterator<Entry<String, String>> ir =eSet.iterator();
		while (ir.hasNext()) {
			Entry<String,String> entry= ir.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.printf(">%s:%s\n",key,value);
			
		}
	}
	
	
	//[1]
	/*
	private static void dispHm(HashMap<String, String> hm) {
		//key : value
		//key : value
		//key : value
		Set<String> kSet =hm.keySet();
		
		Iterator<String> ir = kSet.iterator();
		while (ir.hasNext()) {
			String key = ir.next();
			String value = hm.get(key);
			System.out.printf("%s:%s\n",key,value);	
		}
		
	}
	*/
}//class
