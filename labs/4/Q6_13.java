package lab4;

public class Q6_13 {
	public static void main(String[] args) {
		System.out.println("i\t\tm(i)");
		for(int i = 1; i <= 20; i++)
			System.out.println(i+"\t\t"+sumSeries(i));
	}
	
	public static double sumSeries(int num) {
		double sum = 0;
		for(double i = 0; i <= (double)num; i++) {
			sum += (i/(i+1));
		}
		return sum;
	}
}
