import java.util.Scanner;

public class Q7_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the size of the list: ");
		int array[] = new int[input.nextInt()];
		System.out.print("Enter the contents of the list: ");
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.print("The list has " + array.length + " integers ");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
		
		
		if(isSorted(array)) {
			System.out.println("The list is already sorted");
		} else {
			System.out.println("The list is not sorted");
		}
		
		
		input.close();
	}
	
	public static boolean isSorted(int[] list) {
		for(int i = 0; i < list.length - 1; i++) {
			if(list[i] > list[i+1]) {
				return false;
			}
		}
		return true;
	}

}
