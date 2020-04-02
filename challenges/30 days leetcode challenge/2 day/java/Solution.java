
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashSet;

public class Solution {

  public static void main(final String... args) {
    List<Integer> integers = mapStringsToIntegers(args);
    Map<Integer, Boolean> integersHappy = mapIntegersAreHappy(integers);
    printResult(integersHappy);
  }

  private static List<Integer> mapStringsToIntegers(String... strings) {
    List<Integer> integers = Stream.of(strings)
      .filter(Solution::isInteger)
      .map(Solution::parseStringToInteger)
      .collect(Collectors.toList());

    return integers;
  }

  private static Map<Integer, Boolean> mapIntegersAreHappy(List<Integer> integers) {
    Map<Integer, Boolean> integersHappy = integers.stream()
      .collect(Collectors.toMap(
        (Integer integer) -> integer,
        (Integer integer) -> Soluti0n.isHappy(integer)
      ));
    
    return integersHappy;
  }

  private static boolean isInteger(String possibleInteger) {
    boolean result = Boolean.TRUE;

    try {
      Integer.parseInt(possibleInteger);
    } catch(NumberFormatException e) {
      System.out.printf("The String %s is not a number\n", possibleInteger);
      result = Boolean.FALSE;
    }

    return result;
  }

  private static void printResult(Map<Integer, Boolean> integersHappy) {
    integersHappy.entrySet()
      .stream()
      .forEach(Solution::printEach);
  }

  private static void printEach(Entry<Integer, Boolean> entryValue) {
    if (entryValue.getValue()) {
      System.out.printf("The number %d is happy\n", entryValue.getKey());
    } else {
      System.out.printf("The number %d is not happy\n", entryValue.getKey());
    }
  }

  private static Integer parseStringToInteger(String possibleNumber) {
    return Integer.parseInt(possibleNumber);
  }

  private static class Soluti0n {

    public static boolean isHappy(int n) {
      Set<Integer> integersLooped = new HashSet<>();
      while (true) {
        n = sumPotentialOfDigits(n);
        if (n == 1)
          return true;
        if (integersLooped.contains(n)) 
          break;
        else
          integersLooped.add(n);
        System.out.println(n);
      }

      return false;
    }

    private static int sumPotentialOfDigits(int n) {
      int sum = 0;

      while (n > 0) {
        sum += Math.pow(n % 10, 2);
        n /= 10;
      }

      return sum;
    }

  }

}