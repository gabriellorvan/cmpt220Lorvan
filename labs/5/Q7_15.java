import java.util.Scanner;

public class Q7_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[10];
		
		System.out.print("Enter 10 integers: ");
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		int newArray[] = eliminateDuplicates(array);
		for(int i = 0; i < newArray.length; i++) {
			if(newArray[i] != 0) { //if element is a number
				System.out.print(newArray[i] + " ");
			}
		}
		
		input.close();
	}
	
	public static int[] eliminateDuplicates(int[] list) {
		int singulars[] = new int[10];
		for(int i = 0; i < list.length; i++) {
			if(newValue(singulars, list[i])) {
				singulars[i] = list[i];
			}
		}
		return singulars;
	}
	
	public static boolean newValue(int[] list, int key) {
		for(int i = 0; i < list.length; i++){
			if(key == list[i]) {
				return false;
			}
		}
		return true;
	}
}
