
import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {

    public static void main(final String... args) {
        int[] ints = parseStringToInt(args);
        int result = solve(ints);
        System.out.printf("The result for the array %s is %d\n", Arrays.toString(ints), result);
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
            System.err.printf("error parsing the string %s\n", possibleNumber);
            result = false;
        }
        return result;
    }

    static int solve(int[] ints) {
        if (ints.length == 0) return 0;
        int sum = 0,
            min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] == min) continue;
            if (ints[i] < min) min = ints[i];
            else {
                sum += ints[i] - min;
                min = ints[i];
            }
        }
        return sum;
    }

}
