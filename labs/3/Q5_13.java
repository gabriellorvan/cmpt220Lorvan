package lab3;

public class Q5_13 {

	public static void main(String[] args) {
		int n = 0;
		while(n * n * n < 12000) {
			n++;
		}
		n--;
		System.out.println("The largest integer whose cube is less than 12000 is "
			+ n);
		System.out.println(n + " cubed is " + (n * n * n));
		n++;
		System.out.println("The next highest integer, " + n + ", cubed is "
			+ (n * n * n));
	}

}
