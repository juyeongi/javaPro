package days21;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) throws ParseException {
		
		String source = "2023/08/10 (목) 12:23:01";
		String pattern = "yyyy/MM/dd (E) hh:mm:ss";
		//원하는 형식으로 , date > cal 변환
		SimpleDateFormat sdf= new SimpleDateFormat(pattern);
		Date d = sdf.parse(source);
		
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		//cal> date로 다시 변환 (sdf.format()사용하기 위해서)
		d=c.getTime();
		
		pattern="yyyy년 M월 d일 (E)";
		sdf=new SimpleDateFormat(pattern);
		String strD= sdf.format(d);
		System.out.println(strD);

	} // main
}//class
