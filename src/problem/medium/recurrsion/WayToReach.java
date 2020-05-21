package problem.medium.recurrsion;

import java.util.HashMap;

/*
This is also valid for
Count ways to reach the n’th stair
 */
public class WayToReach {
    static HashMap<Integer, Integer> kv = new HashMap<>();
    private static int waysToReachDestination(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        int n1 = kv.get(n-1) != null ? kv.get(n-1) :waysToReachDestination(n - 1);
        kv.put(n-1, n1);
        int n2 = kv.get(n-2) != null ? kv.get(n-2) :waysToReachDestination(n - 2);
        kv.put(n-2, n2);
        int n3 = kv.get(n-3) != null ? kv.get(n-3) :waysToReachDestination(n - 3);
        kv.put(n-3, n3);

        return n1+n2+n3;
    }

    public static void main(String[] args) {
        System.out.println(waysToReachDestination(4));
    }
}

