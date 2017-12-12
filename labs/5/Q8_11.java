import java.util.Scanner;

public class Q8_11 {
	public static void main(String[] args) {
		String[][] array = new String[3][3];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		int user = input.nextInt();
		String bin = Integer.toBinaryString(512 + user);
		bin = bin.substring(bin.length() - 9);
		for(int i = 0; i < bin.length(); i++)
			if(bin.charAt(i) == '0')
				array[i/3][i%3] = "H";
			else
				array[i/3][i%3] = "T";
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println("");
		}
		
		input.close();
	}

}
