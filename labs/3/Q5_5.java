package lab3;
import java.text.DecimalFormat;

public class Q5_5 {

	public static void main(String[] args) {
		int kg = 1;
		int lb = 20;
		DecimalFormat numberFormatKg = new DecimalFormat("#.0");
		DecimalFormat numberFormatLb = new DecimalFormat("#.00");
		//found the above 2 lines online; book's version would be really long
		System.out.println("Miles\tKilograms\t|\tKilometers\tMiles");
		while(kg < 200) {
			System.out.println(kg + "\t" + numberFormatKg.format((double)(kg) * 2.2) + "\t|\t"
				+ lb + "\t" + numberFormatLb.format((double)(lb) / 2.2));
			kg += 2;
			lb += 5;
		}
	}

}
