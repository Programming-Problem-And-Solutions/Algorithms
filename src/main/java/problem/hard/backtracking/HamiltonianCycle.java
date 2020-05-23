//package problem.hard.backtracking;
//
//        import common.Graph;
//
//        import java.util.Arrays;
//
//public class HamiltonianCycle {
//
//    final static int V = 5;
//    static int path[] = new int[5];
//
//    private static void getHamiltonianPath(int[][] graph) {
//        Arrays.fill(path, -1);
//        // staring with 0
//        path[0] = 0;
//        hamCycleUtil(graph, path, 1);
//    }
//
//    private static boolean isSafe() {
//        return false;
//    }
//
//    private static boolean hamCycleUtil(int[][] graph, int[] path, int pos) {
//
//        if (pos == V) {
//            if (graph[path[pos - 1]][path[0]] == 1)
//                return true;
//            else
//                return false;
//        }
//
//        for (int i = 1; i < V; i++) {
//            if (isSafe()) {
//                path[pos] = i;
//
//                hamCycleUtil(graph, path, pos + 1);
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        int[][] graph = Graph.getGraph();
//        getHamiltonianPath(graph);
//
//    }
//
//}
