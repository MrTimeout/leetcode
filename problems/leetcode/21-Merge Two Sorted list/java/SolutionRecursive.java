
import java.util.Scanner;

public class SolutionRecursive {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(final String... args) {

        int n;
        int[] a, b;

        n = scan.nextInt();

        a = read(n);
        b = read(n);
        
        ListNode al = parse(a);
        ListNode bl = parse(b);

        System.out.printf("%s\n%s\n", al, bl);

        ListNode result = solve(al, bl);

        System.out.println(result);

    }

    static int[] read(int n) {
        int[] ints = new int[n];
        while (n-- > 0) {
            int temp;
            temp = scan.nextInt();
            ints[ints.length-1-n] = temp;
        }
        return ints;
    }

    static ListNode parse(int[] ints) {
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

    static ListNode solve(ListNode l, ListNode ll) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        helper(head, l, ll);
        return temp.next;
    }

    static void helper(ListNode head, ListNode l, ListNode ll) {
        if (l == null && ll == null) return;
        if (l == null) {
            head.next = ll;
            return;
        }
        if (ll == null) {
            head.next = l;
            return;
        }
        if (l.val > ll.val) {
            head.next = ll;
            helper(head.next, l, ll.next);
        } else {
            head.next = l;
            helper(head.next, l.next, ll);
        }
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
