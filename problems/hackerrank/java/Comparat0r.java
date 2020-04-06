
import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.util.stream.Stream;

public class Comparat0r {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(final String... args) {

		int n = scan.nextInt();

		Player[] players = new Player[n];
		while(n-- > 0) {
			players[players.length - 1 - n] = new Player(scan.next(), scan.nextInt());
		}

		scan.close();

		Arrays.sort(players, new Checker());

		Stream.of(players).forEach(System.out::println);

	}

	private static class Checker implements Comparator<Player> {
		@Override
		public int compare(Player p, Player pp) {
			if (p.score == pp.score) return p.name.compareTo(pp.name);
			return pp.score - p.score; // If p.score is greater, then pp will go up and p will go down;
		}
	}

	private static class Player {
		
		private int score;

		private String name;

		public Player(String name, int score) {
			this.score = score;
			this.name = name;
		}

		@Override
		public String toString() {
			return String.format("{\"score\": %d, \"name\": \"%s\"}", this.score, this.name);
		}

	}

}
