package days20;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex07_02 {
	public static void main(String[] args) {
		String strMoney ="1,234,567";
		int money;
		
		//int money = 1234567;
		//System.out.println(money);
		//[2]
		String pattern="#,###";
		DecimalFormat df = new DecimalFormat(pattern);
		//strMoney = df.format(money);
		try {
			Number num = df.parse(strMoney);
			money = num.intValue();
			System.out.println(money);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		//[1]
		/*
		strMoney=strMoney.replace(",", ""); // , 떼기
		System.out.println(strMoney);	//"1234567"
		money = Integer.parseInt(strMoney);
		System.out.println(money); //1234567
		*/
	}//main
}//class
