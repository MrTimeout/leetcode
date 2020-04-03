
import java.util.stream.Stream;
import java.util.Arrays;

public class Solution_1 {
    
    public static void main(final String... args) {
        int[] integers = parseFromStringToInt(args);
        int result = solve(integers);
        System.out.printf("Result of the array(%s) is: %d\n", Arrays.toString(integers), result);
    }

    static int[] parseFromStringToInt(String... strings) {
        int[] integers = Stream.of(strings)
            .filter(Solution_1::isInteger)
            .map(Integer::parseInt)
            .mapToInt(i -> i)
            .toArray();
        return integers;
    }

    static boolean isInteger(String possibleNumber) {
        boolean result = true;
        try {
            Integer.parseInt(possibleNumber);
        } catch (NumberFormatException e) {
            System.err.printf("Error parsing the string %s to a number", possibleNumber);
            result = false;
        }
        return result;
    }

    static int solve(int[] array) {
        int max = array[0],
            sum = array[0];
        for (int i = 1; i < array.length; i++) {
            sum = Math.max(array[i], sum + array[i]);
            max = Math.max(sum, max);
        }
        return max;
    }

}
