package graph.problem;

import java.util.ArrayList;
import java.util.List;

public class CyclicGraphDFS {

    public static boolean visited[] = new boolean[10];
    public static List<List<Integer>> adj = new ArrayList<>();

    public static boolean dfsCyclic(int node, int parent) {
        visited[node] = true;
        for (Integer i : adj.get(node)) {

            if (visited[i] && i != parent)
                return true;
            if (!visited[i])
                dfsCyclic(i, node);
        }
        return false;
    }


    public static void main(String[] args) {
        adj.add(0, List.of());
        adj.add(1, List.of(2, 3));
        adj.add(2, List.of(1, 4));
        adj.add(3, List.of(1, 6, 5));
        adj.add(4, List.of(2, 7));
        adj.add(5, List.of(3, 7));
        adj.add(6, List.of(3));
        adj.add(7, List.of(4, 5));
        System.out.println(dfsCyclic(1, -1));
    }
}
