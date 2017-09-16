package lab2;
import java.util.Scanner;

public class Q4_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		char letter = input.next().charAt(0);
		if(Character.isLetter(letter)) {
			switch(letter) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(letter + " is a vowel.");
				break;
			default:
				System.out.println(letter + " is a consonant.");
			}
		} else {
			System.out.println(letter + " is an invalid input.");
		}
		
		
		input.close();
	}
}
