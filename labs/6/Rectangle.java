package lab6;

public class Rectangle {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(40, 4);
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		
		System.out.println("The width of rectangle 1 is " + rect1.width);
		System.out.println("The height of rectangle 1 is " + rect1.height);
		System.out.println("The area of rectangle 1 is " + rect1.getArea());
		System.out.println("The perimeter of rectangle 1 is " + rect1.getPerimeter());
		
		System.out.println("The width of rectangle 1 is " + rect2.width);
		System.out.println("The height of rectangle 1 is " + rect2.height);
		System.out.println("The area of rectangle 1 is " + rect2.getArea());
		System.out.println("The perimeter of rectangle 1 is " + rect2.getPerimeter());
	}
		
	double height = 1;
	double width = 1;
	
	Rectangle() {
		height = 1;
		width = 1;
	}
	
	Rectangle(double newHeight, double newWidth){
		height = newHeight;
		width = newWidth;
	}
	
	double getArea() {
		return height * width;
	}
	
	double getPerimeter() {
		return 2 * (height + width);
	}
}
