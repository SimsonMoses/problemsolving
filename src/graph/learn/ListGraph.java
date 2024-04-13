package graph.learn;

import java.util.*;

public class ListGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, List<Integer>> listMap = new HashMap<>();
        int n,m;
        m = sc.nextInt();
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            int j = sc.nextInt();
            int s = sc.nextInt();
            if(listMap.get(j)!=null){
                listMap.get(j).add(s);
            }else{
                listMap.put(j,new ArrayList<>());
                listMap.get(j).add(s);
            }
        }
        for(int i=0;i<n;i++){
            System.out.print("node: "+i+" -> ");
            System.out.println(listMap.get(i));
        }
    }
}
