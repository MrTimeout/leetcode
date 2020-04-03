
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Stream;
import java.util.Arrays;

public class Solution_1 {
    
    public static void main(final String... args) {
        int[] integers = parseFromStringToInt(args);
        int sum = integers[0];
        integers = copyArrayFrom(integers, 1, integers.length);
        int[] result = solve(integers, sum);
        System.out.printf("The solution for the bunch of numbers %s and the sum %d is: %s\n", Arrays.toString(integers), sum, Arrays.toString(result));
    }

    static int[] parseFromStringToInt(String[] strings) {
        int[] integers = Stream.of(strings)
            .filter(Solution_1::isNumeric)
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
            System.err.printf("Error parsing the possible number %s\n", possibleNumber);
            result = false;
        }
        return result;
    }

    static int[] copyArrayFrom(int[] source, int from, int to) {
        if (from - to >= 0)
            throw new IllegalArgumentException("error parsing from and to arguments");
        int[] destination = new int[to - from];
        System.arraycopy(source, from, destination, 0, to - from);
        return destination;
    }

    static int[] solve(int[] nums, int sum) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return new int[] {sum - nums[i], nums[i]};
            else set.add(sum - nums[i]);
        }
        throw new RuntimeException("could not find a solution for this situation");
    }

}
