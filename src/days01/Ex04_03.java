package days01;

public class Ex04_03 {

	
	public static void main(String[] args) {
		
	  String name;
	  int age;
	
	  name = "이주영";
	  age = 31;
	  age = age - 1;
	//우측 항 먼저 계산 후 좌측항에 대입
		
	//ctrl + Alt + 방향키	
	
	//출력방식
	//이름은 "이주영"이고, 나이는 '29'살입니다.
	
	  //\제어문자
	 // System.out.println("이름은\""+ name + "\"이고,\n 나이는 \'" + 'age' + "살\입니다.");
	  //System.out.println("이름은\" +name\+""이고,\n 나이는\"+'age'+살\"입니다.");
	  //System.out.printf("출력하고자하는 형식 문자열", 출력할값, 출력할값, , ....);
			              // format --출력형식
		System.out.printf("이름은 %s이고 나이는 %d살 입니다.", name, age);	  
			
	
	
	
	
	
		
	}//main
}//class
