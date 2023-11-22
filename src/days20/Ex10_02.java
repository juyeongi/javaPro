package days20;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex10_02 {

	public static void main(String[] args) {

		String source ="이름:고길동, 나이:20살, 성별:true";
		String pattern = "이름:{0}, 나이:{1}살, 성별:{2}";
		
		MessageFormat mf = new MessageFormat(pattern);
		
		Object[] objs;
		try {
			objs = mf.parse(source);
			for (Object obj : objs) {
				System.out.println(obj);	
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
			
	}//main
}//class
