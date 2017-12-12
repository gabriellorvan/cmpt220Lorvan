package lab4;

public class Q6_9 {

	public static void main(String[] args) {
		System.out.println("Feet\tMeters\t|\tMeters\tFeet");
		for(double i = 1.0; i <= 10; i++)
			System.out.println(i+"\t"+footToMeter(1.0)+"\t|\t"+(20+(5*(i-1)))+"\t"+meterToFoot((20+(5*(i-1))))+"\t");
	}
	
	public static double footToMeter(double foot) {
		double meter;
		meter = 0.305 * foot;	
		return meter;
	}
	
	public static double meterToFoot(double meter) {
		double foot;
		foot = 3.279 * meter;
		return foot;
	}

}
