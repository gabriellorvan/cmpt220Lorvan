package lab1;
import java.util.Scanner;

public class Q2_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();
		double gratuity = subtotal * rate / 100;
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is $" + gratuity 
			+ " and the total is $" + total + ".");
				
		input.close();
	}
}
