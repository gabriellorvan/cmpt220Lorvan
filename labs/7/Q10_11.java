package lab7;

public class Q10_11 {
	public static void main(String[] args) {
		Circle2D c1 = new Circle2D(2, 2, 5.5);

		System.out.println("Circle1 area: " + c1.getArea()); 
		System.out.println("Circle1 perimeter: " + c1.getPerimeter()); 
		System.out.println(
			"(3, 3) in Circle1? " + c1.contains(3, 3)); 
		System.out.println(
			"Does circle1 contain (4, 5), radius 10.5 circle? " 
			+ c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println(
			"Does circle1 overlap (3, 5), radius 2.3 circle? " 
			+ c1.overlaps(new Circle2D(3, 5, 2.3)));
	}
}
