package days20;

import java.io.ObjectInputStream.GetField;
import java.util.Calendar;
import java.util.Date;

public class Ex05_03 {
	public static void main(String[] args) {
		//Calendar > Date 형변환    :calendar.getTime();
		//Date > Calendar 형변환
		Date today = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(today);
	}
}
