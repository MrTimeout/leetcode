
import java.util.stream.Stream;

public class PrintString {
    
    public static void main(final String... args) {
       loopArguments(args); 
    }

    static void loopArguments(String[] args) {
        Stream.of(args)
            .map(PrintString::fromStringToChars)
            .forEach(PrintString::printString);
    }

    static char[] fromStringToChars(String string) {
        char[] result = new char[string.length()];
        for (int i = 0; i < string.length(); i++)
            result[i] = string.charAt(i);
        return result;
    }

    static void printString(char[] chars) {
        helperPrintString(0, chars);
    }

    static void helperPrintString(int index, char[] chars) {
        if (chars == null || chars.length == 0 || index >= chars.length) return;
        System.out.printf("%d -> %c\n", index, chars[index]);
        helperPrintString(++index, chars);
    }

}
