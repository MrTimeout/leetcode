
import java.util.stream.Stream;
import java.util.Arrays;

public class Solution {

    public static void main(final String... args) {
        int[] ints = parseFromStringToInt(args);
        ListNode head = fromArrayToListNode(ints);
        ListNode result = middleNode(head);
        System.out.printf("For the array %s, the result middle ListNode is: %s\n", Arrays.toString(ints), result.toString());
    }

    private static int[] parseFromStringToInt(String[] strings) {
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
            System.err.printf("error parsing a string %s to number\n", possibleNumber);
            result = false;
        }
        return result;
    }

    private static ListNode fromArrayToListNode(int[] ints) {
        if (ints == null || ints.length == 0) throw new IllegalArgumentException("error parsing arguments ints");
        ListNode temp = new ListNode(ints[0]),
                 temp2;
        ListNode head = temp;
        for (int i = 1; i < ints.length; i++) {
            temp2 = new ListNode(ints[i]);
            temp.next = temp2;
            temp = temp2;
        }
        return head;
    }

    private static ListNode middleNode(ListNode head) {
        if (head.next == null) return head;
        int size = size(head);
        int middle = (size % 2 == 0 ? size + 1 : size) / 2;
        size = 0;
        while ((head = head.next) != null && size < middle-1)
            size++;
        return head;
    }

    private static int size(ListNode head) {
        ListNode temp = head;
        int result = 1;
        while ((temp = temp.next) != null) result++;
        return result;
    }

    private static class ListNode {

        private int val;

        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return String.format("[%d, %s]", this.val, this.next);
        }

    }

}
