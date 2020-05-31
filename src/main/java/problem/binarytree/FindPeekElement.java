package main.java.problem.binarytree;
//todo:
public class FindPeekElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 20, 4, 1, 0};
        int n = arr.length;
        System.out.println("Index of a peak point is " +
                findPeak(arr, n));
    }

    private static int findPeak(int[] arr, int n) {
        return findPeakUtil(arr, 0, n);
    }

    private static int findPeakUtil(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + end / 2;
          //  if (arr[mid] > arr[]) {

            //}

        }
return -1;
    }
}
