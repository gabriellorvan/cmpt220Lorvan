package lab9;

public class IllegalTriangleException {

	public static void main(String[] args) {
		if((side1 + side2 < side3) || (side1 + side3 < side2) || (side2 + side3 < side1)) {
			System.out.println("This triangle cannot exist.");
		}

	}

}
