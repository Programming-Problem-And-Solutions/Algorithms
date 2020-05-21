package problem.medium.array;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequencyStream {
    public static void main(String[] args) {
        int k = 4;
        int[] arr = {5, 2, 1, 3, 2};
        int n = arr.length;
        kTop(arr, n, k);
    }

    static int topFrequency = 0;
    static Map<Integer, Integer> valueVsFrequency = new HashMap<>();

    private static void kTop(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            Integer frequency = 0;
            if (valueVsFrequency.containsKey(arr[i])) {
                frequency = valueVsFrequency.get(arr[i]);
            }
            valueVsFrequency.put(arr[i], frequency + 1);
            for (int j = 0; j < topFrequency && j < k; ) {

            }
        }

    }
}
