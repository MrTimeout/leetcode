
import java.util.stream.Stream;
import java.util.Arrays;

public class Solution {

    public static void main(final String... args) {
        int[] integers = parseFromStringToInt(args);
        solve(integers);
        System.out.printf("Definitive array: %s\n", Arrays.toString(integers));
    }

    static int[] parseFromStringToInt(String[] strings) {
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
            System.err.printf("error parsing a string '%s' to a integer\n", possibleNumber);
            result = false;
        }
        return result;
    }

    static void solve(int[] integers) {
        int posZero = integers.length;
        for (int i = 0; i < posZero; i++) {
            if (integers[i] == 0) {
                rotate(integers, i, --posZero);
                i--;
            }
            //System.out.println(Arrays.toString(integers));
        }
    }

    static void rotate(int[] integers, int posActual, int posZero) {
        for (; posActual < posZero; posActual++) {
            integers[posActual] = integers[posActual+1];
        }
        integers[posZero] = 0;
    }

}
