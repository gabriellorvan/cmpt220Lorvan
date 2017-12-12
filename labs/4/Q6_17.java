package lab4;
import java.util.Scanner;

public class Q6_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();
		printMatrix(n);
		input.close();
	}
	
	public static void printMatrix(int n) {
		int[][] matrix = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				double temp = Math.random();
				if(temp > 0.5)
					matrix[i][j] = 1;
				else
					matrix[i][j] = 0;
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
