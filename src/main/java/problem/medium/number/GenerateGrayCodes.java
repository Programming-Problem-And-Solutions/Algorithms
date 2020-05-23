package problem.medium.number;

import java.util.ArrayList;

public class GenerateGrayCodes {

    public static void main(String[] args) {
        generateGrayCode(4, new ArrayList<>());
    }

    private static void generateGrayCode(int n, ArrayList<Integer> values) {
        if (values.size() >= n) {
            values.forEach(System.out::print);
            System.out.println();
            return;
        }

        for (int i = 0; i < 2; i++) {
            ArrayList<Integer> objects = new ArrayList<>();
            objects.add(i);
            values.addAll(objects);
            generateGrayCode(n, values);
            if (!values.isEmpty()) values.remove(values.size() - 1);
        }


    }


}
