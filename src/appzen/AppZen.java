package appzen;

import java.util.ArrayList;

public class AppZen {

    public static void main(String[] args) {
        int[] arr = {-10, -7, -3, -2, 0, 4, 8, 9, 13};
        int sum = 10;
        int x = calculate(arr, sum);
        System.out.println(x);
    }

    private static int calculate(int[] arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] > sum) {
                    count++;
                }
            }
        }
        return count;
    }
}
