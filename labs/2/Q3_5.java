package lab2;
import java.util.Scanner;

public class Q3_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int future = input.nextInt() + today;
		System.out.println("Today is " + GetDay(today) + " and the future day is "
				+ GetDay(future) + ".");
		
		input.close();
		
	}
	public static String GetDay(int num) {
		switch (num % 7) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		default:
			return "Saturday";		
		}
	}
}
