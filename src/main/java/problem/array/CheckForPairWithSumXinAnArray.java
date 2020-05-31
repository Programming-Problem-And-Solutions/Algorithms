package main.java.problem.array;

import java.util.HashSet;
import java.util.Set;

public class CheckForPairWithSumXinAnArray {

    public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, -8 };
        int n = 16;
        int arr_size = A.length;

        // Function calling
        if (hasArrayTwoCandidates(A, arr_size, n))
            System.out.println("Array has two "
                    + "elements with given sum");
        else
            System.out.println("Array doesn't have "
                    + "two elements with given sum");
    }

    private static boolean hasArrayTwoCandidates(int[] a, int arr_size, int sum) {
        Set<Integer> hash = new HashSet<>();
        for (int i = 0; i < arr_size; i++) {
            if (hash.contains(a[i])) {
                return true;
            } else  {
                hash.add(sum - a[i]);
            }
        }
        return false;
    }
}
