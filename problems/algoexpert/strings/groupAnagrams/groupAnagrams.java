
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    
    private static final Scanner scan = new Scanner(System.in);

    public static void main(final String... args) {

        int n = scan.nextInt();
        List<String> strings = new ArrayList<String>();
        String line;

        while (n-- > 0) {
            line = scan.next();
            strings.add(line);
        }

        List<List<String>> result = groupAnagrams(strings);

        System.out.println(result);

    }

    static List<List<String>> groupAnagrams(List<String> strings) {
        Map<String, ArrayList<Integer>> stringsIntegers = new HashMap<String, ArrayList<Integer>>();
        List<List<String>> stringsOfAnagrams = new ArrayList<List<String>>();

        for (int i = 0; i < strings.size(); i++) {
            String orderedString = sortString(strings.get(i));
            if (stringsIntegers.containsKey(orderedString)) {
                stringsIntegers.get(orderedString).add(i);
            } else {
                stringsIntegers.put(orderedString, new ArrayList<Integer>(Arrays.<Integer>asList(i)));
            }
        }

        int cont = 0;
        for (Map.Entry<String, ArrayList<Integer>> entry: stringsIntegers.entrySet()) {
            stringsOfAnagrams.add(new ArrayList<String>());
            for (Integer integer: entry.getValue()) {
                stringsOfAnagrams.get(cont).add(strings.get(integer));
            }
            cont++;
        }

        return stringsOfAnagrams;

    }

    static String sortString(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

}
