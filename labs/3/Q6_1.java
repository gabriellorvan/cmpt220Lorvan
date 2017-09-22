package lab3;

public class Q6_1 {

	public static void main(String[] args) {
		for(int i = 1; i < 101; i++) {
			if(i % 10 != 0)
				System.out.printf("%7d", getPentagonalNumber(i));
			else
				System.out.printf("%7d\n",getPentagonalNumber(i));
		}
	}
	
	public static int getPentagonalNumber(int n) {
		int pent = ((n * (3 * n - 1))/2);
		return pent;
	}

}
