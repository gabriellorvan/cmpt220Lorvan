package lab4;
import java.util.Scanner;

public class Q7_3 {

	public static void main(String[] args) {
		int[] array = new int[100];

		System.out.print("Enter the integers between 1 and 100: ");
		times(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0)
				System.out.println((i + 1) + " occurs " + array[i] +
					" time" + (array[i] > 1 ? "s" : ""));
		}
	}

	public static void times(int[] counts){
		Scanner input = new Scanner(System.in);
		int num;
		do {
			num = input.nextInt();
			if (num >= 1 && num <= 100)	
				counts[num - 1]++;
		} while (num != 0);
		input.close();
	}
}
