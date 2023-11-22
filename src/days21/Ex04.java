package days21;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex04 {
	public static void main(String[] args) throws ParseException {
//		String source = "번호:1,이름:홍길동,주소:서울 양천구 목동";
// 	   위의 문자열에서 MessageFormat 클래스를 사용해서
//	   번호,이름,주소만 얻어와서 아래와 같이 출력
		
		String source = "번호:1,이름:홍길동,주소:서울 양천구 목동";
		int no;
		String name;
		String addr;
		//MessageFormat 형식화클래스 사용x
		
		int Index= source.indexOf("이름:");
		System.out.println(Index);
		
		int beginIndex = Index+("이름:").length();
		int endIndex = source.indexOf(",",Index);
		name=source.substring(beginIndex,endIndex);
		System.out.println(name);
		
		//MessageFormat 형식화클래스 사용
		//MessageFormat.format(addr, args)
		//static 이기때문에 객체생성 x
		//parse 사용시 객체생성해야함
		
		String pattern = "번호:{0},이름:{1},주소:{2}";
		MessageFormat mf = new MessageFormat(pattern);
		Object [] objArr = mf.parse(source);
		//Type mismatch: cannot convert from Object to int
		//no=(int) objArr[0]; //ClassCastException  형변환 x 
									//() cast 연산자 > 강제형변환 (상속관계의 클래스만 가능)
		//"1">1;
		no=Integer.parseInt(objArr[0].toString());
		name=(String) objArr[1];
		addr=(String) objArr[2];
		System.out.println(no);
		System.out.println(name);
		System.out.println(addr);
	
	
	}//main
}//class
