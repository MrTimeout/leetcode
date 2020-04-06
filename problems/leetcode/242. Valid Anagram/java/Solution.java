
import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(final String... args) {
        int n = scan.nextInt();

        String first, second;
        while (n-- > 0) {
            first = scan.next();
            second = scan.next();
            System.out.printf("first: %s, second: %s. Anagram? %s\n", first, second, isAnagram(first, second) ? "TRUE" : "FALSE");
        }

        scan.close();

    }

    static boolean isAnagram(String first, String second) {
        return Arrays.equals(sortString(first), sortString(second));
    }

    static char[] sortString(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return chars;
    }

}
