
import java.util.stream.Stream;
import java.util.Arrays;

public class Solution {

    public static void main(final String... args) {
        int[] ints = fromStringToInt(args);

        ListNode head = fromArrayToListNode(new ListNode(), ints);

        System.out.println(head.toString());

        int result = solve(head);
        System.out.printf("For the array %s the number is: %d", Arrays.toString(ints), result);
    }

    private static int[] fromStringToInt(String[] strings) {
        int[] ints = Stream.of(strings)
            .filter(Solution::isNumeric)
            .map(Integer::parseInt)
            .mapToInt(i -> i)
            .toArray();
        return ints;
    }

    private static boolean isNumeric(String possibleNumber) {
        boolean result = true;
        try {
            Integer.parseInt(possibleNumber);
        } catch (NumberFormatException e) {
            System.err.printf("error parsing the string %s\n", possibleNumber);
            result = false;
        }
        return result;
    }

    private static ListNode fromArrayToListNode(ListNode head, int[] ints) {
        if (ints == null || ints.length == 0) throw new IllegalArgumentException("invalid argument because is empty or it is null");
        ListNode temp = new ListNode(ints[0]),
                 temp2;
        head = temp;
        for (int i = 1; i < ints.length; i++) {
            temp2 = new ListNode(ints[i]);
            temp.next = temp2;
            temp = temp2;
        }
        return head;
    }

    private static int solve(ListNode head) {
        int size = size(head),
            sum = (int) (head.val * Math.pow(2, --size));
        while ((head = head.next) != null)
            sum += (int) (head.val * Math.pow(2, --size));
        return sum;
    }

    private static int size(ListNode head) {
        int result = 1;
        ListNode temp = head;
        while ((temp = temp.next) != null)
            result++;
        return result;
    }

    private static class ListNode {

        private int val;

        private ListNode next;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return String.format("[%d, %s]", this.val, this.next);
        }

    }

}
