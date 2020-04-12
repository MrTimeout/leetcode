
import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(final String... args) {
    
        int target = scan.nextInt(),
            n = scan.nextInt();
        int[] ints = new int[n];

        while (n-- > 0) {
            ints[ints.length -1-n] = scan.nextInt();
        }

        int result = binarySearch(ints, target, true);

        System.out.printf("For the array %s we founded the target %d in: %d\n", Arrays.toString(ints), target, result);

    }

    static int binarySearch(int[] arr, int target, boolean recursive) {
        if (recursive) return binarySearchRecursive(arr, target, 0, arr.length-1);
        else throw new UnsupportedOperationException("binary search iterate is not supported yet");
    }

    static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (right < left) return -1;
        int middle = (right + left) / 2;
        if (arr[middle] == target) return middle;
        else if (arr[middle] > target) binarySearchRecursive(arr, target, left, middle-1);
        else if (arr[middle] < target) binarySearchRecursive(arr, target, middle+1, right);
    }
}
