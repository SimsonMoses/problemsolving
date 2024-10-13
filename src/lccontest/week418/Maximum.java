package lccontest.week418;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Maximum {

    public static int maxGoodNumber(int[] nums) {
        List<String> list= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(Integer.toBinaryString(nums[i]));
        }
//        Collections.sort(list);
        // max number
        list.sort((a,b)->{
            int oneA = count(a);
            int oneB = count(b);
            if(oneA!=oneB){
                return oneA-oneB;
            }
            return b.compareTo(a);
        });
        String s  = String.join("",list);

        return Integer.parseInt(s,2);
    }
    public static int maxBinaryNumber(int[] nums) {
        Integer[] numObjects = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numObjects, (a, b) -> {
            String ab = Integer.toBinaryString(a) + Integer.toBinaryString(b);
            String ba = Integer.toBinaryString(b) + Integer.toBinaryString(a);
            return ba.compareTo(ab);  // Sort by which concatenation results in the larger number
        });

        // Concatenate the sorted binary strings
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(Integer.toBinaryString(num));
        }
        // Convert the final concatenated binary string to a decimal number
        return Integer.parseInt(sb.toString(), 2);
    }
    public static int count(String s){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3};
        System.out.println(maxGoodNumber(a));
    }

}
