package main.java.problem.backtracking;
// { Driver Code Starts


import java.util.*;

public class StringCombination {

    public static void printAllSubsets(int arr[], int n) {
        findSubset(arr, n, new ArrayList<>(), 0);
    }

    static List<Integer> val =  new ArrayList<>();
    static private void findSubset(int arr[], int n, List<Integer> set, int index) {

        if (!val.isEmpty()) {
            return;
        }
        if (index >= 4) {
            if (set.get(0) + set.get(1) == set.get(2) + set.get(3)
                    || set.get(0) + set.get(2) == set.get(1) + set.get(3)
                    || set.get(0) + set.get(3) == set.get(1) + set.get(2)
            ) {
                val.addAll(set);
            }
            return;
        }
        for (int i = index; i < n; i++) {
            set.add(arr[i]);
            findSubset(arr, n, set, index + 1);
            if (!set.isEmpty()) {
                set.remove(set.size() - 1);
            }
        }

    }

    public static void main(String[] args) {
        printAllSubsets(new int[]{3, 4, 7, 1, 2, 9, 8}, 7);
        val.forEach(val-> System.out.print(val));
    }
}