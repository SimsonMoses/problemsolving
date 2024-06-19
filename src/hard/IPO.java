package hard;

import java.util.*;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for(int i=0;i<profits.length;i++){
            treeMap.put(profits[i],i);
        }
        NavigableSet<Integer> desc = treeMap.descendingKeySet();

        int minCaptial = capital[0];
        int j =0;
        for(int i=0;i<capital.length;i++){
            if(capital[i]<minCaptial) {
                minCaptial = capital[i];
                j = i;
            }
        }
        w+=profits[j];
        k--;

        for(Integer key: desc){
            if(k==0)
                break;
            if(key!=profits[j])
                w+=key;
            k--;
        }
        System.out.println(w);
        return w;
    }
}

public class IPO {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[] capital = {0,1,2};
        Solution solution = new Solution();
        solution.findMaximizedCapital(3,0,array,capital);
    }
}
