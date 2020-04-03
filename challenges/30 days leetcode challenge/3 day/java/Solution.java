
import java.util.stream.Stream;
import java.util.Arrays;

public class Solution {
    
    public static void main(final String... args) {
        int[] integers = parseFromStringToInt(args);
        int result = solveMaxSum(integers);
        System.out.printf("This is the result of the array(%s): %d\n", Arrays.toString(integers), result);
    }

    static int[] parseFromStringToInt(String... strings) {
        int[] integers = Stream.of(strings)
            .filter(Solution::isNumeric)
            .map(Integer::parseInt)
            .mapToInt(i -> i)
            .toArray();
        return integers;
    }

    static boolean isNumeric(String possibleNumber) {
        boolean result = true;
        try {
            Integer.parseInt(possibleNumber);
        } catch (NumberFormatException e) {
            System.err.printf("Error parsing the string %s. It is not a number\n", possibleNumber);
            result = false;
        }
        return result;
    }

    static int solveMaxSum(int[] array) {
        int max = Integer.MIN_VALUE,
            sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum > max) max = sum;
            if (sum < 0) sum = 0;
        }
        return max; 
    }

}
