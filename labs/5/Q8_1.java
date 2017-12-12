import java.util.Scanner;

public class Q8_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double array[][] = new double[3][4];
		
		System.out.println("Enter a 3-by-4 matrix row by row:");
		for(int i = 0; i < array.length; i++) {
			for(int k = 0; k < array[i].length; k++) {
				array[i][k] = input.nextDouble();
			}
		}
		
		for(int i = 0; i < array[0].length; i++) {
			System.out.println("Sum of the elements at column " + i
				+ " is " + sumColumn(array, i));
		}
		input.close();
	}

	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for(int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		
		return sum;
	}
}
