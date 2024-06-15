package medium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class SolutionHand{

    public boolean isNStraightHand(int[] hand, int groupSize) {
        Arrays.sort(hand);
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> value = new ArrayList<>();
        for(int n : hand){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int i=0;i<hand.length;i++){
            for(int j=0;j<groupSize;j++){
//                if(map.get(hand[i])){
//
//                }
            }
        }
        return false;
    }

}
public class HandOfStraight {
    public static void main(String[] args) {



    }
}
