package main.java.problem.array;

public class ProductArrayPuzzle {
    public static void main(String[] args) {
        ProductArrayPuzzle pa = new ProductArrayPuzzle();
        int arr[] = {10, 3, 5, 6, 2};
        int n = arr.length;
        System.out.println("Expected : {180, 600, 360, 300, 900}");
        System.out.println("The product array is : ");
        pa.productArray(arr, n);
    }

    /*
        Constrain : Cannot use divide operator
        Solution :

            Taking product array

            10, 3, 5, 6, 2

       for (i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= arr[i];
        }
           temp = 1
            0 - 1,

            temp = 1 * 10
            1 - 10,

            temp = 10*3
            2 - 30,

            temp = 5*30
            3  - 150,

            temp = 150*6
            4  - 900

            then

            temp = 1
            for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }

        {180, 600, 360, 300, 900}



     */
    private void productArray(int[] arr, int n) {
        // Base case
        if (n == 1) {
            System.out.print("0");
            return;
        }

        // Given
        int i, temp = 1;
        int prod[] = new int[n];

        for (int j = 0; j < n; j++)
            prod[j] = 1;
        // Main logic
        for (i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= arr[i];
        }
        temp = 1;
        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }
        for (i = 0; i < n; i++)
            System.out.print(prod[i] + " ");

        return;

    }
}
