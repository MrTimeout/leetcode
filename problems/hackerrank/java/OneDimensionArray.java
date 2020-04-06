
import java.util.Scanner;
import java.util.Arrays;

public class OneDimensionArray {
	
	private static final Scanner s = new Scanner(System.in);

	private static boolean canWin(int leap, int[] game) {
		int cont = 0;
		while (cont < game.length - 1) {
			if (cont + leap > game.length-1) break;
			else if (game[cont + leap] == 0) cont += leap;
			else if (game[cont + 1] == 0) cont++;
			else return false;
		}
		return true;
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
