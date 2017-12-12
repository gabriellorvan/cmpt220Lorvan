package lab4;
import java.util.Scanner;

public class Q7_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];

		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		System.out.println("The mean is " + mean(array));
		System.out.println("The standard deviation is " + deviation(array));
		input.close();
	}

	public static double deviation(double[] array) {
		double deviation = 0;
		double mean = mean(array);
		for (int i = 0; i < array.length; i++) {
			deviation += Math.pow(array[i] - mean, 2);
		}
		return Math.sqrt(deviation / (array.length - 1));
	}

	public static double mean(double[] array) {
		double mean = 0;
		for (int i = 0; i < array.length; i++) {
			mean += array[i];
		}
		return mean / array.length;
	}
}
