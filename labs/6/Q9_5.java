package lab6;
import java.util.GregorianCalendar;

public class Q9_5 {

	public static void main(String[] args) {
		GregorianCalendar day = new GregorianCalendar();
		System.out.println("The date today is "
			+ day.get(GregorianCalendar.DAY_OF_MONTH) + "/"
			+ day.get(GregorianCalendar.MONTH) + "/"
			+ day.get(GregorianCalendar.YEAR) + ".");
		
		day.setTimeInMillis(123456789876L);
		System.out.println("The date at milliseconds provided is "
				+ day.get(GregorianCalendar.DAY_OF_MONTH) + "/"
				+ day.get(GregorianCalendar.MONTH) + "/"
				+ day.get(GregorianCalendar.YEAR) + ".");
	}

}
