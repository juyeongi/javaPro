package days20;

import java.text.MessageFormat;

public class Ex10 {
//		형식화클래스
//		MessageFormat
//		특정형식의 데이터(값) 출력
//		특정형식의 데이터(값) 읽기
	public static void main(String[] args) {
		String name = "고길동";
		int age = 28;
		boolean gender = true;
		
		//위의 데이터들을 특정형식으로 출력
		//[1]
		/*
		String output = String.format("이름: %s, 나이%d, 성별 %s", name, age, gender);
		System.out.println(output);
		*/
		
		//[2]MessageFormat
		String pattern = "이름: {0}, 나이: {1}세, 성별: {2} ";
		String output = MessageFormat.format(pattern,  name, age, gender);
		System.out.println(output);
		
		//INSERT INTO board (no, title, writer, content, regdate)
		//VALUES	"('{0}''{1}''{2}''{3}''{4})";
		
	}//main
}//class
