
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
        ListNode head = parse(ints, p);
        System.out.println(head);
        boolean result = solve(head);
        System.out.printf("Has a cycle? %s\n", result ? "YES" : "NO");
    }

    static ListNode parse(int[] ints, int p) {
        ListNode temp = new ListNode(ints[0]),
                 temp3 = null;
        ListNode head = temp;
        for (int i = 1; i < ints.length; i++) {
            ListNode temp2 = new ListNode(ints[i]);
            temp.next = temp2;
            temp = temp2;
            if (i == p) {
                temp3 = temp2;
            }
        }
        temp.next = temp3;
        return head;
    }

    static boolean solve(ListNode head) {
        if (head == null) return false;
        ListNode a = head, b = head;
        while (a != null && a.next != null) {
            a = a.next.next;
            b = b.next;
            if (a == b) return true;
        }
        return false;
    }

    static class ListNode {
    
        private int val;

        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

    }

}
