package problem.medium.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {
    public static void main(String[] args) {
        String values = "ABCD";
        printCombinations(values, 0, new ArrayList<>());
    }

    private static void printCombinations(String value, int index, List<String> comb) {

        if(comb.size() == 2 && index < 4) {
            comb.forEach(System.out::print);
            System.out.println();
            return;
        }

        for (int i = index; i < 4; i++) {
            char c = value.charAt(i);
            if (!comb.contains(c+"")) {
                comb.add(c+"");
            }
            printCombinations(value, index + 1, comb);
            comb.remove(comb.size()-1);
        }

    }
}
