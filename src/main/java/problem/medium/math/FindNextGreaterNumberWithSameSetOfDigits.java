package problem.medium.math;

public class FindNextGreaterNumberWithSameSetOfDigits {

    public static void findNext(String s, int n) {
        findSubset(s, n, "", 0);
    }

    static private void findSubset(String s, int n, String val, int index) {

        if (index >= n) {
            if (!val.isEmpty() && Integer.valueOf(val).compareTo(534976) > 0) {
                System.out.println(val);
            }
            return;
        }
        for (int i = index; i < n; i++) {
            int value = s.charAt(i) - '0';
            if (!val.contains(value+"")) {
                val  = val+value;
            }
            findSubset(s, n, val , index + 1);
        }

    }

    public static void main(String[] args) {
        findNext("534976", 6);
    }
}
