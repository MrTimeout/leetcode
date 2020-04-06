
import java.util.Scanner;
import java.util.Arrays;

public class OneDimensionArray {
	
	private static final Scanner s = new Scanner(System.in);

	private static boolean canWinRecur(int leap, int[] game, int i) {
		if (i < 0 || game[i] == 1) return false;
		if (i == game.length - 1 || i + leap > game.length - 1) return true;
		game[i] = 1; // This is uesd to not enter in an endessly loop
	  return canWinRecur(leap, game, i+1) || canWinRecur(leap, game, i-1) || canWinRecur(leap, game, i+leap);
	}

	private static boolean canWin(int leap, int[] game) {
		return canWinRecur(leap, game, 0);
	}

	public static void main(final String... args) {
		int n = s.nextInt();
		
		while (n-- > 0) {
			int total, leap;
			
			total = s.nextInt();
			leap = s.nextInt();
			
			int[] game = new int[total];

			while (total-- > 0) game[game.length -total-1] = s.nextInt();

			System.out.println(canWin(leap, game) ? "YES" : "NO");

		}

		s.close();
	}

}

/**
 * Example:
 *
 * Input:
 * 4
 * 5 3
 * 0 0 0 0 0
 * 6 5
 * 0 0 0 1 1 1
 * 6 3
 * 0 0 1 1 1 0
 * 3 1
 * 0 1 0
 *
 * Output:
 * YES
 * YES
 * NO
 * NO
 */ 
