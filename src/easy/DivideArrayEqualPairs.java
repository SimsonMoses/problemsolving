package easy;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DivideArrayEqualPairs {
    public static void main(String[] args) {
        int nums[] = new int[]{2,2,2,2,3,3};
        System.out.println(divideArray(nums));
    }
    public static boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> table = new HashMap<>();
        for(int i:nums) {
            table.put(i,1+table.getOrDefault(i,0));
        }
        for(Map.Entry<Integer,Integer> entry:table.entrySet()) {
            if(entry.getValue()%2!=0){
                return false;
            }
        }
        return true;
    }

}
