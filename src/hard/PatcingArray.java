package hard;

class SolutionPatching {

    public int minPatches(int[] nums, int n) {
        int count = 0;
        int i = 0;
        int reach = 1;
        while(reach<=n){
            if(i<nums.length && nums[i]<=(reach)){
                reach += nums[i];
                i++;
            }else{
                reach+=(reach);
                count++;
            }
        }
        return count;
    }
}


public class PatcingArray {
    public static void main(String[] args) {

    }
}
