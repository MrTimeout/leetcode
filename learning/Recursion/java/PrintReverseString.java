
import java.util.stream.Stream;

public class PrintReverseString {
    
    public static void main(final String... args) {

        Stream.of(args)
            .map(PrintReverseString::toChar)
            .forEach(PrintReverseString::printReverse);

    }

    static char[] toChar(String string) {
        return string.toCharArray();
    }

    static void printReverse(char[] chars) {
        helperPrintReverse(0, chars);
    }

    static void helperPrintReverse(int index, char[] chars) {
        if (chars == null || chars.length == 0 || index >= chars.length) return;
        helperPrintReverse(index + 1, chars);
        System.out.printf("%d -> %c\n", index, chars[index]);
    }

}
