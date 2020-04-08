
import java.util.stream.Stream;

public class ReverseString {

    public static void main(final String... args) {
        Stream.of(args)
            .map(ReverseString::toChar)
            .peek(ReverseString::solve)
            .forEach(System.out::println);
    }

    static char[] toChar(String string) {
        return string.toCharArray();
    }

    static void solve(char[] s) {
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length -1 - i];
            s[s.length -1 -i] = temp;
        }
        return;
    }

}
