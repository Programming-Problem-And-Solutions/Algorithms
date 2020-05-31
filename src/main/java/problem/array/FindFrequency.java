package main.java.problem.array;

import java.util.stream.Stream;

public class FindFrequency {


    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 4, 3, 5, 1};
        findFrequency(arr);

        Stream.of(arr).forEach(val->{
            System.out.println(val);
        });

    }

    /*

    {1, 1, 3, 4, 3, 6, 7, 0, 0};

     */
    static int i = 0;

    private static void findFrequency(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                int value = arr[j];
                int valueAtIndex = arr[value];

                while (i != 0) {
                    int val = arr[4];
                    if (arr[val] < 0) {
                        arr[val] = --arr[val];
                        i = 0;
                    }
                }
                if (valueAtIndex == value) {
                    arr[value] = -2;
                } else if (valueAtIndex < 0) {
                    arr[value] = --valueAtIndex;
                } else {
                    if (valueAtIndex > 0)
                        i = valueAtIndex;
                    arr[value] = -1;
                }

            }
        }

    }
}
