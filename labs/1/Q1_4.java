package lab1;

public class Q1_4 {
	public static void main(String[] args) {
		System.out.println("a    a^2  a^3");
		System.out.println(1 + "    " + square(1) + "    " + cube(1));
		System.out.println(2 + "    " + square(2) + "    " + cube(2));
		System.out.println(3 + "    " + square(3) + "    " + cube(3));
		System.out.println(4 + "    " + square(4) + "   " + cube(4));
	}
	
	public static int square(int number) {
		return number * number;
	}
	
	public static int cube(int number) {
		return number * number * number;
	}
}
