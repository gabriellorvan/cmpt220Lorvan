package lab10;
import java.util.ArrayList;

public class Q13_3 {

	public static void sort(ArrayList<Number> list) {
		for(int i = 0; i < list.size()-1; i++) {     
			for (int j = 0; j < list.size()-i-1; j++) {
				if (list.get(j).doubleValue() > list.get(j+1).doubleValue()) {
					Number temp = list.get(j);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
	
	
}
