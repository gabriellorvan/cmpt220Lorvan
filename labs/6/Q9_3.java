package lab6;

import java.util.Date;

public class Q9_3 {

	public static void main(String[] args) {
		Date date = new Date();
		date.setTime(10000);
		System.out.println("The date and time for 10000 is " + date.toString());
		date.setTime(100000);
		System.out.println("The date and time for 100000 is " + date.toString());
		date.setTime(1000000);
		System.out.println("The date and time for 1000000 is " + date.toString());
		date.setTime(10000000);
		System.out.println("The date and time for 10000000 is " + date.toString());
		date.setTime(100000000);
		System.out.println("The date and time for 100000000 is " + date.toString());
		date.setTime(1000000000);
		System.out.println("The date and time for 1000000000 is " + date.toString());
	/*	date.setTime(10000000000);
		System.out.println("The date and time for 10000000000 is " + date.toString());
		date.setTime(100000000000);
		System.out.println("The date and time for 100000000000 is " + date.toString());
		*/ // these last tow are not working because the .setTime() method appears to
		   // be expecting an int and not a long
	}

}
