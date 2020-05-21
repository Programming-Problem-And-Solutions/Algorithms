import java.util.HashMap;

public class WaysToReachDest {
    public static void main(String[] args) {
        System.out.println(findNumOfWaysToReachN(17));
    }

//    static Map<Integer, Integer>
    private static int findNumOfWaysToReachN(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int numOfWaysToReachByJumping1 = findNumOfWaysToReachN(n - 1);
        int numOfWaysToReachByJumping2 = findNumOfWaysToReachN(n - 2);
        return numOfWaysToReachByJumping1 + numOfWaysToReachByJumping2;
    }
}
