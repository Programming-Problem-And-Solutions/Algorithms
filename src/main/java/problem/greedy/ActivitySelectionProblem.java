package main.java.problem.greedy;

public class ActivitySelectionProblem {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int finish[] = {2, 4, 6, 7, 9, 9};
        findFeasibleSlot(start, finish);
    }

    private static void findFeasibleSlot(int[] start, int[] finish) {
        int startWindow = -1;
        int endWindow = -1;

        for (int i = 0; i < start.length; i++) {
            if ((start[i] >= endWindow)) {
                System.out.print(i+" ");
                if (startWindow == -1) {
                    startWindow =  start[i];
                }
                endWindow =  finish[i];
            }
        }

    }
}
