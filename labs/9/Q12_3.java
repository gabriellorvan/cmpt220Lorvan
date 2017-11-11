package lab9;
import java.util.Scanner;

public class Q12_3 {

	public static void main(String[] args) {
		int[] array = new int[100];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100);
		}
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the desired index of the array: ");
		int index = input.nextInt();
		
		numberAtIndex(index, array);
		
		
		
		input.close();
	}
	
	public static void numberAtIndex(int index, int[] array) {
		if(index < 0 || index > 99) {
			System.out.println("Out of Bounds");
		} else {
			System.out.println("The integer at index " + index + " is " + array[index]);
		}
	}

}
