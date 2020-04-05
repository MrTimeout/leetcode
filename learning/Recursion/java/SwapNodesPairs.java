
import java.util.stream.Stream;

public class SwapNodesPairs {

    public static void main(final String... args) {
      
        int[] ints = fromStringToInt(args);

        ListNode listNode = transformToListNode(new ListNode(), ints);

        System.out.println(listNode.toString());

        listNode = solve(listNode);

        System.out.println(listNode);

    }

    static int[] fromStringToInt(String[] strings) {
        int[] ints = Stream.of(strings)
            .filter(SwapNodesPairs::isNumeric)
            .map(Integer::parseInt)
            .mapToInt((i) -> i)
            .toArray();
        return ints;
    }

    static boolean isNumeric(String possibleNumber) {
        boolean result = true;
        try {
            Integer.parseInt(possibleNumber);
        } catch (NumberFormatException e) {
            System.out.printf("error parsing string %s to number\n", possibleNumber);
            result = false;
        }
        return result;
    }

    static ListNode transformToListNode(ListNode head, int[] ints) {
        if (ints == null || ints.length == 0) throw new IllegalArgumentException("error parsing the array ints");
        ListNode temp = new ListNode(ints[0]);
        head = temp;
        ListNode temp2;
        for (int i = 1; i < ints.length; i++) {
            temp2 = new ListNode(ints[i]);
            temp.setNext(temp2);
            temp = temp2;
        }
        return head;
    }

    static ListNode solve(ListNode head) {
        if (head == null || head.next() == null) return null;
        ListNode post = solve(head.next().next());
        ListNode res = head.next();
        res.setNext(head);
        head.setNext(post);
        return res;
    }

    static void printListNode(ListNode listNode) {
        ListNode local = listNode;
        int cont = 0;
        do {
            System.out.println(listNode.val());
            cont++;
        } while ((local = listNode.next()) != null && cont < 5);
    }

    static class ListNode {
        
        private int val;

        private ListNode next;

        ListNode() {
            this.next = null;
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        void setNext(ListNode listNode) {
            this.next = listNode;
        }

        ListNode next() {
            return this.next;
        }

        void setVal(int val) {
            this.val = val;
        }

        int val() {
            return this.val;
        }

        @Override
        public String toString() {
            return String.format("[%d, %s]", this.val, this.next == null ? "null" : this.next);
        }

    }

}
