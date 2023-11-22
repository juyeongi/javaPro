package days23;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex07 {
	public static void main(String[] args) {
		//days20.Ex01.java 읽어서
		//HashMap 저장 - key + value
		//						'a'		 10
		//						'b'		 15
		//수량 'a' 10	##########
		
		//'0'~'9'	, 'A'~'Z' , 'a'~'z', '가'~'힣 오름차순정렬
		
		
		String fileName = ".\\src\\days20\\Ex01.java";
		int code =-1;
		char one = '\u0000'; 
		HashMap<Character, Integer> hmap=new HashMap<>();
		try(FileReader fr = new FileReader(fileName)) {
			
			code = fr.read();
			//					끝을 만나면 -1
			while ((code = fr.read())!=-1) {
				one =(char)code;
//				System.out.println(one);
				//읽어온문자 (key)== one 가 hmap에 존재한다면
				//value값 1 증가시키고
				//존재하지않으면 새로 엔트리 추가
			    //hmap.put('p', 1); ==hmap.put(key, value);
				/*
				if (hmap.containsKey(one)) {
					int value = hmap.get(one);
					hmap.put(one, value+1);	// 문자열 존재할 때
				}else {
//					hmap.put(one, 1);	//문자열 존재하지 않을 때
				}//if
				*/
				
				hmap.put(one, hmap.getOrDefault(one, 0)+1);
							//(one, 0) :존재하지 않을 때 0값
							//(one, 0)+1 : 문자열 존재할 때 1++
			}//while
			
			//key 	value
			//'A'(20)	#####...
			
			Set<Entry<Character, Integer>> eset =hmap.entrySet();
			Iterator<Entry<Character, Integer>> ir =eset.iterator();
			while (ir.hasNext()) {
				Entry<Character, Integer> entry = ir.next();
				char key = entry.getKey();	//charactor ->언박싱 char
				int value = entry.getValue();//Integer ->언박싱 int
				System.out.printf("'%c':(%d)%s\n",key,value, "#".repeat(value));
				
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//main


}//class
