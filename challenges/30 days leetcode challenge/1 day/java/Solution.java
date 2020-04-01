
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Stream;

public class Solution {
    
  public static void main(final String... args) {
		Soluti0n solution = new Soluti0n();
		
		int[] integers = parseToInt(args);

		int result = solution.singleNumber(integers);

		System.out.println(result);
  }

	private static int[] parseToInt(final String... strings) {
		Integer[] integers = Stream.of(strings)
			.map(Integer::valueOf)
			.toArray(Integer[]::new);
			
		return fromIntegerToInt(integers);
	}

	private static int[] fromIntegerToInt(Integer[] integers) {
		int[] ints = new int[integers.length];
		for (int i = 0; i < integers.length; i++) {
			ints[i] = integers[i];
		}
		return ints;
	}

	private static class Soluti0n {

		public int singleNumber(int[] numbers) {
			Set<Integer> integers = new HashSet<Integer>(numbers.length / 2 + 1);
			for (int eachNumber: numbers) {
				if (integers.contains(eachNumber)) {
					integers.remove(eachNumber);
				} else {
					integers.add(eachNumber);
				}
			}
			return integers.iterator().next();
  	}

	}

}