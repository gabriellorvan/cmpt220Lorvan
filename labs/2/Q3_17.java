package lab2;
import java.util.Scanner;

public class Q3_17 { //I honestly have no idea why this isn't running correctly.

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//int computerThrow = ((int)(input.nextLong()) % 3); //testing line
		int computerThrow = (int)(System.currentTimeMillis());
		System.out.print("scissor (0), rock (1), paper (2): ");
		int yourThrow = (input.nextInt() % 3);
		if(((yourThrow + 1) % 3) == (computerThrow)) {
			System.out.println("The computer is " + GetName(computerThrow)
				+ ". You are " + GetName(yourThrow) + ". The computer won.");
		} else if(((yourThrow + 2) % 3) == (computerThrow)) {
			System.out.println("The computer is " + GetName(computerThrow)
			+ ". You are " + GetName(yourThrow) + ". You won.");
		} else {
			System.out.println("The computer is " + GetName(computerThrow)
			+ ". You are " + GetName(yourThrow) + ", too. It is a draw.");
		} 
		
		
		input.close();
	}
	
	public static String GetName(int aThrow) {
		switch(aThrow) {
		case 0:
			return "scissors";
		case 1:
			return "rock";
		default:
			return "paper";
		}
	}
}
