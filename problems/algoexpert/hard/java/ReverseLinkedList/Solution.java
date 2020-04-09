
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
            ints[ints.length -1-n] = temp;
        }

        scan.close();

        LinkedList head = fromIntToLinkedList(ints);

        System.out.println(head);

        LinkedList reverse = reverse(head);

        System.out.println(reverse);

    }

    static LinkedList fromIntToLinkedList(int[] ints) {
        LinkedList temp = new LinkedList(ints[0]),
                   temp2;
        LinkedList head = temp;
        for (int i = 1; i < ints.length; i++) {
            temp2 = new LinkedList(ints[i]);
            temp.next = temp2;
            temp = temp2;
        }
        return head;
    }

    static LinkedList reverse(LinkedList head) {
        return helper(null, head);
    }

    static LinkedList helper(LinkedList pre, LinkedList node) {
        if (node == null) return pre;
        LinkedList temp = node.next;
        node.next = pre;
        return helper(node, temp);
    }

    static class LinkedList {

        private int val;

        private LinkedList next;

        public LinkedList(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return String.format("%d -> %s", this.val, this.next);
        }

    }

}
