package lab3;
import java.util.Scanner;

public class Q6_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		
		displaySortedNumbers(num1, num2, num3);
		
		input.close();
	}
	
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		/*featuring a bubble sort from later in the book, but correct (the
		 * book has an error in their code).
		 */
		double number[] = new double[] {num1, num2, num3};
		for(int i = 1; i < number.length; i++) {
			double currentNumber = number[i];
			int k;
			for(k = i - 1; (k >= 0) && (number[k] > currentNumber); k--) {
				number[k+1] = number[k];
				number[k] = currentNumber;
			}
		}
		for(int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}

}
