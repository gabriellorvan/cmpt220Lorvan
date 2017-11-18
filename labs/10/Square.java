package lab10;

public class Square extends GeometricObject implements Colorable{

	public void howToColor() {
		System.out.println("Color all four sides");
	}
	
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double length) {
		side = length;
	}
	
	private double side;
	
	Square(){
		side = 0;
	}
	
	Square(double length){
		side = length;
	}

}
