import java.util.Scanner;

public class Q8_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double matrix1[][] = new double[3][3];
		double matrix2[][] = new double[3][3];
		System.out.print("Enter matrix1: ");
		for(int i = 0; i < 9; i++) {
			matrix1[i / 3][i % 3] = input.nextDouble();
		}
		System.out.print("Enter matrix2: ");
		for(int i = 0; i < 9; i++) {
			matrix2[i / 3][i % 3] = input.nextDouble();
		}
		
		double matrix3[][] = addMatrix(matrix1, matrix2);
		System.out.println("The matrices are added as follows");
		
		System.out.println(matrix1[0][0] + " " + matrix1[0][1] + " " +
			matrix1[0][2] + "   " + matrix2[0][0] + " " + matrix2[0][1] + " " + 
			matrix2[0][2] + "   " + matrix3[0][0] + " " + matrix3[0][1] + " " +
			matrix3[0][2]);
		System.out.println(matrix1[1][0] + " " + matrix1[1][1] + " " +
			matrix1[1][2] + " + " + matrix2[1][0] + " " + matrix2[1][1] + " " + 
			matrix2[1][2] + " = " + matrix3[1][0] + " " + matrix3[1][1] + " " +
			matrix3[1][2]);
		System.out.println(matrix1[2][0] + " " + matrix1[2][1] + " " +
			matrix1[2][2] + "   " + matrix2[2][0] + " " + matrix2[2][1] + " " + 
			matrix2[2][2] + "   " + matrix3[2][0] + " " + matrix3[2][1] + " " +
			matrix3[2][2]);
		
		input.close();
	}

	public static double[][] addMatrix(double[][] a, double[][] b){
		double c[][] = new double[3][3];
		for(int i = 0; i < a.length; i++) {
			for(int k = 0; k < a[i].length; k++) {
				c[i][k] = a[i][k] + b[i][k];
			}
		}
		return c;
	}
	
	public static String printMatrixAddition
			(double[][] a, double[][] b, double[][] c) {
		for(int i =0; i < 3; i++) {
			
		}
		
		return "";
	}
}
