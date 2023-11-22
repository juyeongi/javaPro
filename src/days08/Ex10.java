package days08;

public class Ex10 {
	public static void main(String[] args) {
		//신용카드
		
		String card= "7655-8988-9234-5677";
		String regex="-"; //구분자 기준으로 문자열자르기
		String [] cardArr=card.split(regex);// 자른 문자열 배열로 나열(4개 생성됨)
		//0~3
		int index=((int)Math.random()*4); //배열 위치값
		cardArr[index]="****";
		//원하는 형식으로 변환
		/*
		String printCard=String.format("%s-%s-%s-%s"
				,cardArr[0],cardArr[1],cardArr[2],cardArr[3]);
		System.out.println(printCard);
		*/
		
		String printCard=String.join("-", cardArr); //String.join
		System.out.println(printCard);
		
		
		
		/*		
		"7655-****-9234-5677"
		"7655-8988-9234-****"
		"****-8988-9234-5677"
		"7655-8988-****-5677"
		*/
		
		
	}//main
}//class
