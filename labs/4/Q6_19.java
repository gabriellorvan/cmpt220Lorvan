package lab4;
import java.util.Scanner;

public class Q6_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the three sides of your triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		if(isValid(side1,side2,side3))
			System.out.println("The area is " + area(side1,side2,side3));
		else
			System.out.println("That triangle is not valid");
		input.close();
	}
	
	public static boolean isValid(double side1, double side2, double side3) {
		if ((side1 + side2) > side3){
            if((side1 + side3) > side2){
                if(side2 + side3 > side1){
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
	}
	
	public static double area(double side1, double side2, double side3) {
		double area = 0;
		double s = perimeter(side1,side2,side3) / 2;
		area = Math.sqrt((s)*(s-side1)*(s-side2)*(s-side3)); //Heron's formula for area
		return area;
	}
	
	public static double perimeter(double side1, double side2, double side3) {
		double p = 0;
		p = side1 + side2 + side3;
		return p;
	}

}
