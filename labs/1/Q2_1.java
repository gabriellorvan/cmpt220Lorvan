package lab1;
import java.util.Scanner;

public class Q2_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a temperature in Celsius: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.println(celsius + " in Celsius is " + fahrenheit
				+ " in Fahrenheit.");
		
		input.close();
	}

}
