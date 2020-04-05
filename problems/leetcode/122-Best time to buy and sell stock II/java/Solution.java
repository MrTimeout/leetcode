
import java.util.stream.Stream;
import java.util.Arrays;

public class Solution {

    public static void main(final String... args) {
        int[] ints = parseStringToInt(args);
        int result = solve(ints);
        System.out.printf("The result for the array %s is: %d", Arrays.toString(ints), result);
    }

    static int[] parseStringToInt(String[] strings) {
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
        int sum = 0,
            min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] == min) continue;
            if (prices[i] < min) min = prices[i];
            else {
                sum += prices[i] - min;
                min = prices[i];
            }
        }
        return sum;
    }

}
