
import java.util.stream.Stream;
import java.util.Arrays;

public class Solution_1 {

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
        int cont = 0;

        for (int i = 0; i < integers.length; i++)
            if (integers[i] != 0)
                integers[cont++] = integers[i];

        while (cont < integers.length) {
            integers[cont] = 0;
            cont++;
        }

    }

}
