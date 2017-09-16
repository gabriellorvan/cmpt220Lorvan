package lab2;
import java.util.Scanner;

public class Q4_21 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a SSN: ");
		String ssn = input.next();
		System.out.println(CheckSSN(ssn));
		
		input.close();
	}
	
	public static String CheckSSN(String num) {
		if(num.length() != 11)
			return num + " is an invalid social security number.";
		for(int i = 0; i < 11; i++) {
			if(i == 3 || i == 6) {
				if(num.charAt(i) != '-') {
					return num + " is an invalid social security number.";
				}
			} else if((Character.isDigit(num.charAt(i))) != true){
				return num + " is an invalid social security number.";
			}
		}
		
		return num + " is a valid social security number.";
	}
}
