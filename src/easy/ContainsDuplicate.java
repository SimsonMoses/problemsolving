package easy;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {

        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int nums[] = {1,2,3,4,5,6,7,8,1,10};
        System.out.println(containsDuplicate.containsDuplicate(nums));

    }

    public boolean containsDuplicate(int[] nums) {
        // int freq[] = new int[26];
        Hashtable<Integer,Integer> freq = new Hashtable<>();
        for(int i:nums){
            if(freq.get(i)!=null){
                return true;

            }
            freq.put(i,1);
        }
        return false;
    }
}
