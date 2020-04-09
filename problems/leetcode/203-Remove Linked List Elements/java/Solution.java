
import java.util.Scanner;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(final String... args) {
        int n, p;
        int[] ints;
        n = scan.nextInt();
        ints = new int[n];
        while (n-- > 0) {
            int temp;
            temp = scan.nextInt();
            ints[ints.length-1-n] = temp;
        }
        p = scan.nextInt();
        scan.close();
        ListNode head = parse(ints);
        System.out.println(head);
        ListNode result = solve(head, p);
        System.out.println(result);
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

    static ListNode solve(ListNode head, int val) {
        ListNode temp = head;
        if (temp == null) return null;
        while (temp.val == val) {
            temp = temp.next;
            if (temp == null) return temp;
        }
        head = temp;
        while (temp.next != null) {
            if (temp.next.val == val) temp.next = temp.next.next;
            else temp = temp.next;
        }
        return head;
    }

    static class ListNode {

        private int val;
        
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public String toString() {
            return String.format("%d -> %s", this.val, this.next);
        }

    }

}
