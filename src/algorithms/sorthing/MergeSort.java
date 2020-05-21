package algorithms.sorthing;


public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {67, 4, 6, 1, 8, 5};
        mergeSort(arr, 0, arr.length);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }


    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + end / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int l = mid - start + 1;
        int r = end - mid;

        int [] left = new int[l];
        int [] right = new int[r];

        for (int i = 0; i < l; i++) {
            left[i] = arr[l+i];
        }
        for (int i = 0; i < r; i++) {
            right[i] = arr[l+mid+i];
        }

        int i = 0, j = 0;
        int k = start;

        while (i < start && j < end)
        {
            if (left[i] <= right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < start)
        {
            arr[k] = left[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < end)
        {
            arr[k] = right[j];
            j++;
            k++;
        }

    }
}
