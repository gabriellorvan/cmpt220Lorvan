import java.util.Scanner;

public class Q7_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double array[] = new double[10];		
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		System.out.println(array.length);
		System.out.println("The mean is " + mean(array));
		
		System.out.println("The standard deviation is " + deviation(array));
		
		input.close();
	}

	public static double mean(double[] x) {
		double mean = 0;
		for(int i = 0; i < x.length; i++) {
			mean += (x[i] / 10);
		}
		return mean;
	}
	
	public static double deviation(double[] x) {
		double mean = mean(x);
		double totalXiMinusMeanSquared = 0;
		for(int i = 0; i < x.length; i++) {
			totalXiMinusMeanSquared += (x[i] - mean) * (x[i] - mean);
		}
		double dev = Math.sqrt((totalXiMinusMeanSquared)/(x.length - 1));
		
		return dev;
	}
}
