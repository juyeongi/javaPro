package days21;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;

import java.time.DayOfWeek;
public class Ex09 {
//		[TemporalAdjusters]클래스
//		-날짜,시간 +수정 with(), plusXXX(), minus(),....
//		자주 사용되는 날짜,시간 변경 메서드들을 미리 구현해놓은 클래스
//		ex) 다음 년도의 첫 날
//			  다음 달의 첫 날
//			  올 해의 첫 날
//			  이번 달의 첫 날
//			  올 해의 마지막 날
//			  이번달의 마지막 날 : lastDayOfMonth()***
//			  다음 ?요일
//			  지난 ?요일
//			  이번달 n번째 ?요일
	public static void main(String[] args) {
		LocalDate d = LocalDate.now();
		System.out.println(d);
											//TemporalAdjusters.*생략	
		//다음달 첫날
		System.out.println(d.with(firstDayOfNextMonth()));  
		 //이번달 첫날
		System.out.println(d.with(firstDayOfMonth()));
//		이번달 첫번째 월요일
		System.out.println(d.with(firstInMonth(DayOfWeek.MONDAY)));
//		지난주 화요일
		System.out.println(d.with(previous(DayOfWeek.TUESDAY)));
//		orSame 오늘 포함
		System.out.println(d.with(previousOrSame(DayOfWeek.FRIDAY)));
//		다음주금요일 휴강
		System.out.println(d.with(next(DayOfWeek.FRIDAY)));
//		+오늘 포함
		System.out.println(d.with(nextOrSame(DayOfWeek.FRIDAY)));
		
		//이번달 네번째 화요일
		System.out.println(d.with(dayOfWeekInMonth(4, TUESDAY)));
		
		//3일 뒤 약속
//		d=d.plusDays(d);
		d=d.with(new DayAfter3일());
		System.out.println(d);
	}
}

class DayAfter3일 implements TemporalAdjuster{

	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(3, ChronoUnit.DAYS);
	}
	
}