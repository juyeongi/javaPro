package days15;

import java.util.Arrays;

//import days14.Point; 1)

public class Ex01 {
	public static void main(String[] args) {
		//위의 두 문자열 n, m 이 알파벳과 알파벳갯수가 똑같은지 비교하는 코딩 
		//결과는 같을 경우 true/ 다를 경우 false 로 출력.
		//조건) 대소문자는 구분하지 않는다.
		String n = "keNik";
		String m= "kKnie";
		char[]nArr =n. toUpperCase().toCharArray();
		char[]mArr =m. toUpperCase().toCharArray();
		Arrays.sort(nArr);
		Arrays.sort(mArr);
		n =String.valueOf(nArr);
		n =String.valueOf(mArr);
		System.out.println(n.equals(m));
		
		/*
		System.out.println(n+"/"+m);
		
		n= n.toUpperCase();
		m=m.toUpperCase();
		
		System.out.println(n+"/"+m);
		//문자열정렬  KENIK 
		char [] nArr =n.toCharArray();
		Arrays.sort(nArr);
		
		System.out.println(Arrays.toString(nArr));
		
		char [] mArr =m.toCharArray();
		Arrays.sort(mArr);
		
		System.out.println(Arrays.toString(mArr));
		
		//char[]> string
		
		n= String.valueOf(nArr);
		m= String.valueOf(mArr);
		
		System.out.println(n+"/"+m);
		System.out.println(n.equals(m));
		*/
		
		
		/*1)
		Point p1 =new Point (1,2);
		Point p2 =new Point (10,20);
		
		//Point p3 = p1+p2  p3.x=p1.x+p2.x
		Point p3= p1.plusPoint(p2);
		p3.printPoint();
		*/
		
		/*
		String n = "keNik";   
		String m= "kKnie"; 

		n = n.toUpperCase().chars().sorted()
				.collect(StringBuilder::new,
						StringBuilder::appendCodePoint,
						StringBuilder::append)
				.toString();

		m = Stream.of(m.toUpperCase().split(""))
				.sorted()
				.collect(Collectors.joining());

		System.out.println(n+"/"+m);
		System.out.println( n.equals(m));
	*/
	}
}
