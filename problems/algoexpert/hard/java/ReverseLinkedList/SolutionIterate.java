
import java.util.Scanner;

public class SolutionIterate {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(final String... args) {
        int n;
        int[] ints;
        n = scan.nextInt();
        ints = new int[n];
        while (n-- > 0) {
            int temp;
            temp = scan.nextInt();
            ints[ints.length-1-n] = temp;
        }
        scan.close();
        ListNode head = fromIntsToListNode(ints);
        System.out.println(head);
        ListNode reverse = solve(head);
        System.out.println(reverse);
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

    static ListNode solve(ListNode head) {
        ListNode a = null, b, c = null;
        while (head != null) {
            b = head.next;
            a = head;
            a.next = c;
            c = head;
            head = b;
        }
        return a;
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
