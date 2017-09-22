package lab3;
import java.util.Scanner;

public class Q5_16 {

	public static void main(String[] args) {
		String factors = "";
		boolean factorable = true;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int big = input.nextInt();
		int oldBig = big;
		int currentFactor = 2;
		while(factorable) {
			if(big < currentFactor) {
				break;
			} else {
				while(big % currentFactor == 0) {
					factors = factors + currentFactor + ",";
					big = big / currentFactor;
				}
			}
			currentFactor++;
		}
		System.out.println("The non-one factors of " + oldBig + " are " + factors);
		
		input.close();
	}

}
