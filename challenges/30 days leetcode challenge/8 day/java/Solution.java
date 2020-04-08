
import java.util.Scanner;

public class Solution {

	private static final Scanner scan = new Scanner(System.in);

	public static void main(final String... args) {
		
		int n;
		int[] ints;

		n = scan.nextInt();
		if (n <= 0) throw new IllegalArgumentException("could not parse correctly the number of elements of the array");

		ints = new int[n];

		while (n-- > 0) {
			int temp;
			temp = scan.nextInt();
			ints[ints.length -1 -n]	= temp;
		}

		scan.close();

		ListNode head = fromArrayToListNode(ints);

		ListNode result = solve(head);

		System.out.printf("The result is the node: %s\n", result.toString());

	}

	static int[] fromStringToInt(String[] strings) throws NumberFormatException {
		int l = strings.length;
		int[] ints = new int[l];
		while (--l >= 0) {
			int temp = strings.length -1 -l;
			ints[temp] = Integer.parseInt(strings[temp]);
		}
		return ints;
	}

	static ListNode fromArrayToListNode(int[] ints) {
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
		ListNode fast = head,
						 slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

	static class ListNode {
		
		int val;

		ListNode next;

		public ListNode(int val) {
			this.val = val;
		}

		@Override
		public String toString() {
			return String.format("%d, %s", this.val, this.next);
		}

	}

}
