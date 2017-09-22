package lab3;
import java.util.Scanner;

public class Q5_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pos = 0;
		int neg = 0;
		float total = 0;
		int check = 0;
		int count = 0;
		boolean mode = true;
		
		System.out.print("Enter an integer, the input ends if it is 0: ");
		while(input.hasNextInt()) {
			check = input.nextInt();
			if(check == 0) {
				if(count == 0)
					mode = false;
				break;
			} else if(check > 0) {
				pos++;
				total += check;
			} else {
				neg++;
				total += check;
			}
			count++;
		}
		
		if(mode) {
			float avg = (total / (pos+ neg));
			System.out.println("The number of positives is " + pos);
			System.out.println("The number of negatives is " + neg);
			System.out.println("The total is " + total);
			System.out.println("The average is " + avg);
		} else {
			System.out.println("No numbers are entered except 0");
		}
		
		
		
		
		input. close();
	}

}
