package common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Adjacency List Representation
(0)--(1)--(2)
 |   / \   |
 |  /   \  |
 | /     \ |
(3)      (4)

0 - 1,3
1 - 0,2,3,4
2 - 1,4
3 - 0,1
4 - 1,2


 */
public class Graph {
    Map<Integer, List<Integer>> nodeVsEdge = new HashMap<>();

    public void addNode(Integer node, Integer edge) {
        if (nodeVsEdge.containsKey(node)) {
            List<Integer> integers = nodeVsEdge.get(node);
            integers.add(edge);
            nodeVsEdge.put(node, integers);
        }
        nodeVsEdge.put(node, List.of(edge));
    }

    /*
    0 - 1,3
    1 - 0,2,3,4
    2 - 1,4
    3 - 0,1
    4 - 1,2
     */
    public static int[][] getGraph() {

        int graph[][] =
                        {{0, 1, 0, 1, 0},
                        {1, 0, 1, 1, 1},
                        {0, 1, 0, 0, 1},
                        {1, 1, 0, 0, 1},
                        {0, 1, 1, 1, 0},
                };
        return graph;
    }


}
