package graph.takeU.dfs;

import java.util.ArrayList;
import java.util.List;

public class DFSTravesal {

    public static List<Integer> list = new ArrayList<>();

    public static List<List<Integer>> adj = new ArrayList<List<Integer>>();

    public static boolean visit[] = new boolean[15];

    public static List<Integer> dfsGraph(int node){
        visit[node] = true;
        list.add(node);
        for(int i : adj.get(node)){
            if(!visit[i]){
                dfsGraph(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        adj.add(0, List.of(1));
        adj.add(1, List.of(4, 5));
        adj.add(2, List.of());
        adj.add(3, List.of(11));
        adj.add(4, List.of(2, 3));
        adj.add(5, List.of(10,12));
        adj.add(6, List.of());
        adj.add(7, List.of());
        adj.add(8, List.of());
        adj.add(9, List.of());
        adj.add(10, List.of());
        adj.add(11, List.of());
        adj.add(12, List.of());
        System.out.println(dfsGraph(0));

    }
}
