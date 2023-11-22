package days20;

import java.text.ChoiceFormat;

import javax.security.auth.callback.ChoiceCallback;

public class Ex09 {
//		형식화클래스
//		choiceformat
//		1)특정범위에 속하는 값을 문자열로 변환
//		2)불연속적인 범위의 값을 처리하는데
//			if문, switch문을 대신해서 사용
//			> 복잡한 처리를 간단한 코딩으로 처리 가능
	public static void main(String[] args) {
//		ex) 국어점수 입력받아서 수~가 문자열 출력
//				if,switch문 >choiceformat
		
		//형식 : limit#value
		String newPattern= "0#가|60#양|70#미|80#우|90#수";
		ChoiceFormat cf =new ChoiceFormat(newPattern);
		
		/*
		double[] limits= {0, 60, 70, 80, 90};	//작은 값부터
		String[] formats= {"가","양","미","우","수"};	//반환할 문자열
		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		*/
		int [] kors = {100, 67, 23, 99};
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d->%s 등급\n",kors[i],cf.format(kors[i]));
		} //	for
		
	}//main
}//class
