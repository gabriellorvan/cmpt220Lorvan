package lab11;
import java.util.Scanner;

public class Q18_11 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long number = input.nextLong();
		System.out.println("The sum of the digits is " + sumDigits(number));
		input.close();
	}
	
	
	public static int sumDigits(long n) {
		int sum = (int)(n % 10);
		n = n/10;
		if(n > 1)
			return sum + sumDigits(n); 
		else
			return sum;
	}

}
