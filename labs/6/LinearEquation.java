package lab6;
import java.util.Scanner;

public class LinearEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the six values for a through f: ");
		double aUser = input.nextDouble();
		double bUser = input.nextDouble();
		double cUser = input.nextDouble();
		double dUser = input.nextDouble();
		double eUser = input.nextDouble();
		double fUser = input.nextDouble();
		
		LinearEquation eq = new LinearEquation(aUser, bUser, cUser, dUser, eUser,
			fUser);
		
		if(eq.isSolvable()) {
			System.out.println("X is " + eq.getX());
			System.out.println("Y is " + eq.getY());
		} else {
			System.out.println("The equation has no solution.");
		}
	}
	
	private double a = 0;
	private double b = 0;
	private double c = 0;
	private double d = 0;
	private double e = 0;
	private double f = 0;
	
	LinearEquation(double setA, double setB, double setC, double setD,
		double setE, double setF) {
		a = setA;
		b = setB;
		c = setC;
		d = setD;
		e = setE;
		f = setF;
	}
	
	private double getA() {
		return a;
	}
	
	private double getB() {
		return b;
	}
	
	private double getC() {
		return c;
	}

	private double getD() {
		return d;
	}
	
	private double getE() {
		return e;
	}
	
	private double getF() {
		return f;
	}
	
	private boolean isSolvable() {
		if((a * d - b * c) == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	private double getX() {
		return ((e * d - b * f) / (a * d - b * c));
	}
	
	private double getY() {
		return ((a * f - e * c) / (a * d - b * c));
	}
}
