package lab3;
import java.util.Scanner;

public class Q6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int possPalindrome = input.nextInt();
		
		if(isPalindrome(possPalindrome)) {
			System.out.println(possPalindrome + " is a palindrome");
		} else {
			System.out.println(possPalindrome + " is not a palindrome");
		}
		
		input.close();
	}
	
	public static int reverse(int number) {
		int reverse = 0;
		while (number > 0) {    
		    int lastDigit = number % 10;
		    reverse = reverse * 10 + lastDigit;
		    number = number / 10; 
		}
		return reverse;
	}
	
	public static boolean isPalindrome(int number) {
		return (number == reverse(number));
	}

}
