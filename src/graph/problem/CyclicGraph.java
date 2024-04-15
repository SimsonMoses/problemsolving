package graph.problem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Pair{
    int s,parent;
    Pair(int s,int parent){
        this.s = s;
        this.parent = parent;
    }
}
public class CyclicGraph {
    public static boolean visited[] = new boolean[10];

    public static boolean isCyclic(int src, List<List<Integer>> adj, int v) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(src,-1));
        visited[src] = true;

        while(!queue.isEmpty()){
            Pair pair = queue.poll();
            int currentElement = pair.s;
            int parent = pair.parent;
            for(int i: adj.get(currentElement)){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(new Pair(i,currentElement));
                } else if (parent!=i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        list.add(0,List.of());
        list.add(1, List.of(2, 3));
        list.add(2, List.of(1, 4));
        list.add(3, List.of(1,6,5));
        list.add(4, List.of(2));
        list.add(5, List.of(3,7));
        list.add(6, List.of(3));
        list.add(7, List.of(5));
        for(int i =0;i<8;i++){
            if(!visited[i] && isCyclic(i,list, 8)){
                System.out.println(true);
            }
        }
        System.out.println(isCyclic(1,list, 8));

    }
}
