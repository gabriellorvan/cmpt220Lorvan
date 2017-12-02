package lab11;
import java.util.Scanner;

public class Q18_13 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[8];
		System.out.print("Enter a set of eight numbers: ");
		for(int i = 0; i < 7; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("The largest number is " + findMax(array, 7));
		input.close();
	}
	
	public static int findMax(int[] a, int index) {
	    if (index > 0) {
	        return Math.max(a[index], findMax(a, index-1));
	    } else {
	        return a[0];
	    }
	}

}
