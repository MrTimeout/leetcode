
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Solution {

  public static void main(final String... args) {

    int[] integers = parseFromStringToInteger(args);

    int[] integersToParse = copyArrayFromTo(integers, 0, integers.length);

    System.out.printf("The solution is: %s\n", Arrays.toString(findPair(integersToParse, integers[0])));

  }

  private static int[] findPair(int[] integers, int sum) {
    System.out.printf("The sum is: %d and the array of integers is: %s\n", sum, Arrays.toString(integers));
    for (int i = 0; i < integers.length; i++) {
      for (int j = i+1; j < integers.length; j++) {
        if (integers[i] + integers[j] == sum) return new int[] {integers[i], integers[j]};
      }
    }
    throw new RuntimeException("could not find the pair that adds the sum");
  } 

  private static int[] parseFromStringToInteger(String[] strings) {
    int[] integers = Stream.of(strings)
      .filter(Solution::isNumeric)
      .map(Integer::parseInt)
      .mapToInt(i -> i)
      .toArray();

    return integers;
  }

  private static int[] copyArrayFromTo(int[] array, int from, int to) {
    if (from >= to)
        throw new IllegalStateException("From cant be greater than to");
    int[] result = new int[to-from];
    System.arraycopy(array, from, result, 0, result.length);
    return result;
  }

  private static boolean isNumeric(String possibleInteger) {
    boolean result = true;
    
    try {
      Integer.parseInt(possibleInteger);
    } catch (NumberFormatException e) {
      System.err.printf("Error parsing the string %s to a number\n", possibleInteger);
    }

    return result;
  }

}
