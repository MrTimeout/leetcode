
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Solution {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(final String... args) {

		int q = scan.nextInt();

		while (q-- > 0) {

			int n = scan.nextInt();
			int[] ints = new int[n];

			while (n-- > 0)
				ints[ints.length -1-n] = scan.nextInt();

			int result = countElements(ints);

			System.out.printf("For the array %s the count of elements is: %d\n", Arrays.toString(ints), result);

		}

		scan.close();

	}

	static int countElements(int[] ints) {
		Map<Integer, CustomInt> mapInts = new HashMap<Integer, CustomInt>();
		int cont = 0;
		for (int i: ints) {
			if (mapInts.get(i) != null) {
				mapInts.get(i).increment();
			} else {
				mapInts.put(i, new CustomInt());
			}
		}
		for (Map.Entry<Integer, CustomInt> entry: mapInts.entrySet()) {
			if (mapInts.get(entry.getKey() + 1) != null) cont += entry.getValue().value;
		}
		return cont;
	}

	static class CustomInt {
		
		int value = 1;

		void increment() { this.value++; }

		@Override
		public String toString() {
			return String.format("%d", this.value);
		}

	}

}
