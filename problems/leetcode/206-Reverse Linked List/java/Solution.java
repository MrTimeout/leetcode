
import java.util.stream.Stream;
import java.util.Arrays;

public class Solution {
    
    public static void main(final String... args) {
        int[] ints = fromStringToArrayInt(args);
        ListNode head = fromArrayToListNode(ints);
        ListNode reverseHead = reverseList(head);
        System.out.printf("The reverse list is %s", reverseHead.toString());
    }

    private static int[] fromStringToArrayInt(String[] strings) {
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
            System.err.printf("error parsing the string %s to a number\n", possibleNumber);
            result = false;
        }
        return result;
    }

    private static ListNode fromArrayToListNode(int[] ints) {
        if (ints == null || ints.length == 0) throw new IllegalArgumentException("Error parsing the argument int[]");
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

    private static ListNode reverseList(ListNode head) {
        ListNode newHead = head,
                 temp = null,
                 temp2 = null;
        while (head != null) {
            temp2 = head.next;
            newHead = head;
            newHead.next = temp;
            temp = newHead;
            head = temp2;
        }
        return newHead;
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
