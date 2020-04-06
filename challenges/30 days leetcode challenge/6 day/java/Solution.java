
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(final String... args) {

        int n = scan.nextInt();
        String[] strings = new String[n];
        String line;

        while (n-- > 0) {
            line = scan.next();
            strings[strings.length -1 -n] = line;
        }

        List<List<String>> result = groupAnagrams(strings);

        for (List<String> list: result) System.out.println(list);

    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,Integer> groupStringInteger = new HashMap<String,Integer>();
        List<List<String>> groupAnagrams = new ArrayList<List<String>>();

        int cont = 0;
        for (int i = 0; i < strs.length; i++) {
            String orderedString = sortString(strs[i]);
            if (groupStringInteger.containsKey(orderedString)) {
                int pos = groupStringInteger.get(orderedString);
                ArrayList<String> l = new ArrayList<String>(groupAnagrams.get(pos));
                l.add(strs[i]);
                groupAnagrams.set(pos, l);
            } else {
                groupStringInteger.put(orderedString, cont);
                groupAnagrams.add(Arrays.<String>asList(strs[i]));
                cont++;
            }
        }

        return groupAnagrams;
    }

    private static String sortString(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

}
