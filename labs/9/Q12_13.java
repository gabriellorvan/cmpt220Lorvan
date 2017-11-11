package lab9;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileNotFoundException;

public class Q12_13 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Invalid arguments.");
			System.exit(1);
		}
		
		File filename = new File(args[0]);
	    if (!filename.exists()) {
	        System.out.println(args[0] + " does not exist.");
	    }
	    
	    
	    int words = 0;
	    int lines = 0;
	    int characters = 0;
	    try {
	        Scanner input = new Scanner(filename);
	        while (input.hasNext()) {
	        	lines++;
	            String line = input.nextLine();
	            characters += line.length();
	            words += new StringTokenizer(line, " ,").countTokens();
	        }
	        input.close();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
	    
	    
	    System.out.println("File " + filename + " has:");
	    System.out.println(characters + "characters");
	    System.out.println(words + "words");
	    System.out.println(lines + "lines");
	}

}
