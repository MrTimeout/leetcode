
import java.util.stream.Stream;
import java.util.Arrays;

public class Solution {

    public static void main(final String... args) {
        int[] ints = parseFromStringToInt(args);
        int result = solve(ints);
        System.out.printf("For the array '%s' the result is: %d\n", Arrays.toString(ints), result);
    }

    static int[] parseFromStringToInt(String... strings) {
        int[] ints = Stream.of(strings)
            .filter(Solution::isNumeric)
            .map(Integer::parseInt)
            .mapToInt(i -> i)
            .toArray();
        return ints;
    }

    static boolean isNumeric(String possibleNumber) {
        boolean result = true;
        try {
            Integer.parseInt(possibleNumber);
        } catch (NumberFormatException e) {
            System.err.printf("error parsing the string %s to a number\n", possibleNumber);
            result = false;
        }
        return result;
    }

    static int solve(int[] prices) {
        if (prices.length == 0) return 0;
        int min = prices[0],
            max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - min > max) max = prices[i] - min;
            if (prices[i] < min) min = prices[i];
        }
        return max;
    }

}
