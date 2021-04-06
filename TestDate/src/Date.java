
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Date {
	public static void main(String[] args)
	{
		LocalDate today = LocalDate.now();
		/*int day = localDate.getDayOfMonth();
		LocalDateTime localDateTime = LocalDateTime.now();
	    int c=add(10,20);
		LocalTime lTime = LocalTime.now();
		System.out.println(lTime.plusMinutes(39));*/
		LocalDate dob = LocalDate.of(1981,01,01);
		
		//LocalDate today = null;
		Period period = Period.between(dob, today);
		LocalDate lastDay = dob.plusYears(60);
		Period periodLeft = Period.between(today, lastDay);
		System.out.printf("no.of years =%d, no.of months=%d,no.of days=%d",period.getYears(),period.getMonths(),period.getDays());

		System.out.printf("\n no.of years left=%d, no.of months left=%d,no.of days left=%d",periodLeft.getYears(),periodLeft.getMonths(),periodLeft.getDays());
		
		
		
		
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
}
