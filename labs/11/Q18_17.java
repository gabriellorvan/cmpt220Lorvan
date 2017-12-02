package lab11;
import java.util.Scanner;

public class Q18_17 {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of characters in one line: ");
        String string = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        char[] chars = string.replaceAll(" ", "").toCharArray();
        System.out.println("'" + ch + "' in \"" + string + "\" appears " + count(chars, ch) + " times.");
        input.close();
    }

    private static int count(char[] chars, char ch) {
        return count(chars, ch, chars.length - 1);
    }

    private static int count(char[] chars, char ch, int high) {
        int count = (chars[high] == ch) ? 1 : 0;
        if (high == 0)
            return count;
        else
            return count + count(chars, ch, high - 1);
    }
}
