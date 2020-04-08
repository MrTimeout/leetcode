
import java.util.Scanner;

public class ReverseStringRecursive {

	private final static Scanner scan = new Scanner(System.in);

	public static void main(final String... args) {
		
		String s, rs;

		s = scan.next();

		rs = solve(s);

		System.out.printf("The reverse String of %s is %s\n", s, rs);

	}

	static String solve(String s) {
		char[] chars = s.toCharArray();
		return String.valueOf(reverse(chars, 0));
	}

	static char[] reverse(char[] chars, int index) {
		if (index >= chars.length/2) return chars;
		char temp = chars[index];
		chars[index] = chars[chars.length-1-index];
		chars[chars.length-1-index] = temp;
		return reverse(chars, index + 1);
	}

}
