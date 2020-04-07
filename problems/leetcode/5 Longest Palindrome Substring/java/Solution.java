
import java.util.Scanner;

public class Solution {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(final String... args) {
		
		int n = scan.nextInt();

		while (n-- > 0) {
			
			String string = scan.next();

			String result = solve(string);
			//boolean result = isPalindrome(string);

			System.out.printf("For the string %s, the longest palindrome string is: %s\n", string, result);

		}

		scan.close();

	}

	static boolean isPalindrome(String s) {
		int length = s.length();
		for (int i = 0; i < length / 2; i++) {
			if (s.charAt(i) != s.charAt(length-i-1)) return false;
		}
		return true;
	}

	static int goodLen(int length, String string) {
		int a = string.length();
		for (int lower = 0; lower + length <= a; lower++) {
			if (isPalindrome(string.substring(lower, lower + length))) return lower;
		}
		return -1;
	}

	static String solve(String string) {
		int bestLen = 0;
		String bestString = null;
		System.out.println(string);
		for (int parity: new int[]{0, 1}) {
			int low = 1, high = string.length();
			if (low % 2 != parity) low++;
			if (high % 2 != parity) high--;
			while (low <= high) {
				int mid = (low + high) / 2;
				if (mid % 2 != parity) mid++;
				if (mid > high)	break;
				int temp = goodLen(mid, string);
				if (temp != -1) {
					if (mid > bestLen) {
						bestLen = temp;
						bestString = string.substring(temp, temp + mid);
					}
					low = mid + 2;
				} else {
					high = mid - 2;
				}
			}
		}
		return bestString;
	}

}
