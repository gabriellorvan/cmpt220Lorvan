package lab2;
import java.util.Scanner;

public class Q4_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		System.out.print("Enter hourly pay: ");
		double perHour = input.nextDouble();
		double gross = hours * perHour;
		System.out.print("Enter federal tax withholding rate (decimal): ");
		double fedRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate (decimal): ");
		double stateRate = input.nextDouble();
		double fedWith = gross * fedRate;
		double stateWith = gross * stateRate;
		double totalDed = fedWith + stateWith;
		double netPay = gross - totalDed;
		
		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Pay Rate: $" + perHour);
		System.out.println("Gross Pay: " + gross);
		System.out.println("Deductions:");
		System.out.println("\t Federal Withholding (" + fedRate * 100
			+ "%): $" + fedWith);
		System.out.println("\t State Withholding (" + stateRate * 100
				+ "%): $" + stateWith);
		System.out.println("\t Total Deduction: " + totalDed);
		System.out.println("Net Pay: $" + netPay);
		
		
		input.close();
	}

}
