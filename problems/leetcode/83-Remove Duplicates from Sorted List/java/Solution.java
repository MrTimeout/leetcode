
import java.util.Scanner;

public class Solution {

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
        ListNode head = parse(ints);
        System.out.println(head);
        ListNode result = solve(head);
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

    static ListNode solve(ListNode head) {
        ListNode temp = head,
                 temp2;
        temp2 = temp;
        while (temp != null) {
            while (temp != null && temp.next != null && temp.val == temp.next.val) {
                remove(temp);
            }
            temp = temp.next;
        }
        return temp2; 
    }

    static void remove(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
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
