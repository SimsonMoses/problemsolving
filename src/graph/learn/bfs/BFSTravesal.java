package graph.learn.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSTravesal {

    public static List<Integer> bfsGraph(List<List<Integer>> adj,int v){
        List<Integer> bfs = new ArrayList<>();
        boolean visit[] = new boolean[v];
        visit[0] = true;
        Queue<Integer> q = new LinkedList();
        q.add(0);
        while(!q.isEmpty()){
           int vertex = q.poll();
           bfs.add(vertex);
           for(int ed: adj.get(vertex)){
               if(visit[ed]!=true){
                   visit[ed] = true;
                   q.add(ed);
               }
           }
        }
        return bfs;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(0, List.of(1));
        list.add(1, List.of(4, 5));
        list.add(2, List.of());
        list.add(3, List.of(11));
        list.add(4, List.of(2, 3));
        list.add(5, List.of(10,12));
        list.add(6, List.of());
        list.add(7, List.of());
        list.add(8, List.of());
        list.add(9, List.of());
        list.add(10, List.of());
        list.add(11, List.of());
        list.add(12, List.of());
        System.out.println(bfsGraph(list,13));

    }
}
