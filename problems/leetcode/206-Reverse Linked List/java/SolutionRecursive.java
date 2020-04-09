
import java.util.Scanner;

public class SolutionRecursive {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(final String... args) {

        int n;
        int[] ints;

        n = scan.nextInt();
        ints = new int[n];
        while(n-- > 0) {
            int temp;
            temp = scan.nextInt();
            ints[ints.length-1-n] = temp;
        }

        scan.close();

        ListNode head = fromIntsToListNode(ints);

        System.out.println(head);

        try { ListNode recur = recursive(null, head); System.out.println(recur); } catch (Throwable t) { System.err.println("error"); }

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

    static ListNode recursive(ListNode pre, ListNode node) {
        if (node == null) return pre;
        ListNode temp = node.next;
        node.next = pre;
        return recursive(node, temp);
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
