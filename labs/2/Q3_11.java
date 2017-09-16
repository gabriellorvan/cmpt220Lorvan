package lab2;
import java.util.Scanner;

public class Q3_11 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the month: ");
	int month = input.nextInt();
	System.out.print("Enter the year: ");
	int year = input.nextInt();
	
	System.out.println(GetMonthAndYear(month, year) + " has " + GetDays(month, year)
		+ " days.");
	
	input.close();
	}
	
	public static int GetDays(int m, int y) {
		switch(m % 12) {
		case 0: //Dec
			return 31;
		case 1: //Jan
			return 31;
		case 2: //Feb, etc.
			if((y % 4 == 0) && (y % 1000 != 0)) {
				return 29;
			} else {
				return 28;
			}
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		default: //Nov
			return 30;
		}
	}
	public static String GetMonthAndYear(int m, int y) {
		switch(m % 12) {
		case 0:
			return "December " + y;
		case 1:
			return "January " + y;
		case 2:
			return "February " + y;
		case 3:
			return "March " + y;
		case 4:
			return "April " + y;
		case 5:
			return "May " + y;
		case 6:
			return "June " + y;
		case 7:
			return "July " + y;
		case 8:
			return "August " + y;
		case 9:
			return "September " + y;
		case 10:
			return "October " + y;
		default:
			return "November " + y;
		}
	}
}
