package main.java.problem.string;

public class ExtractMaxFromString {
    public static void main(String[] args) {
        String str = "100klh564abc365bg";
        System.out.println(extractMaximum(str));
    }
    static int max = Integer.MIN_VALUE;
    private static int extractMaximum(String str) {
        int num = 0;
        for (int i = 0 ; i < str.length() ; i++)  {
            char val = str.charAt(i);
            if (isNum(val)) {
                num = (10*num) + (val - '0');
            } else {
                if (num > max) {
                    max =  num;
                    num = 0;
                }
            }
        }
        return max;
    }

    private static boolean isNum(char val) {
        int  i  = val - '0';
        return i >= 0 && i <= 9;
    }
}
