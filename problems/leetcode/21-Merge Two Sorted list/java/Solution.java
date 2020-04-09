
import java.util.Scanner;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(final String... args) {

        int a;
        int[] b, c;

        a = scan.nextInt();
        
        b = readFromInput(a);
        c = readFromInput(a);

        scan.close();

        ListNode bl = fromIntsToListNode(b);
        ListNode cl = fromIntsToListNode(c);

        ListNode result = solve(bl, cl);

        System.out.println(result);

    }

    static int[] readFromInput(int n) {
        int[] ints = new int[n];
        while (n-- > 0) {
            int temp;
            temp = scan.nextInt();
            ints[ints.length-1-n] = temp;
        }
        return ints;
    }

    static ListNode fromIntsToListNode(int[] ints) {
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

    static ListNode solve(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode head = temp;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                temp.next = l2;
                break;
            } else if (l2 == null) {
                temp.next = l1;
                break;
            } else if (l1.val > l2.val) {
                temp.next = l2;
                l2 = l2.next;
            } else {
                temp.next = l1;
                l1 = l1.next;
            }
            temp = temp.next;
        }
        return head.next;
    }

    static class ListNode {
    
        private int val;

        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return String.format("%d -> %s", this.val, this.next);
        }

    }

}
