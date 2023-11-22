package days09;
public class Ex03 {
	//[주민등록번호] : Resident Registration Number, RRN
	//생년월일
	//나이
	//성별, 내/외국인
	//검증번호
	
	public static void main(String[] args) {
		String rrn="990123-1700001";
		
		String birthday = getBirth(rrn);
		
		System.out.println(birthday);
		
	}//main
	
	public static int getGender(String rrn) {
		//return Integer.parseInt(rnn.substring(7,8));
		return rrn.charAt(7)-'0' ;   //'0'   48 ascii코드  int일 때 48+7로 불러옴
		//rrn.charAt(7)-'48' 
	}

	private static String getBirth(String rrn) {
		//String year = rrn.substring(0,2);
		int year = Integer.parseInt(rrn.substring(0,2));
		//String month = rrn.substring(2,4);
		int month = Integer.parseInt(rrn.substring(2,4));
		//String day = rrn.substring(4,6);
		int day = Integer.parseInt(rrn.substring(4,6));
		//System.out.printf("%s.%s.%s\n",year,month,day);
		//7번째자리로 연대 측정가능. 
		//"1999.1.23"
		int ㅅ =getGender(rrn);
		int centry=1800;
		switch (ㅅ) {
		case 1: case 2 : case 5: case  6:
			centry =1900;
			break;
		case 3: case 4: case 7: case 8:
			centry =20;
			break;
		case 9: case 0:
			centry =18;
			break;
		}
		year =centry +year;
		String birthday = String.format("%d.%d.%d",year, month, day);
		
		return birthday;
	}

}//class
