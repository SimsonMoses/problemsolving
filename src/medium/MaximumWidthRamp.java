package medium;


public class MaximumWidthRamp {

    public static int maxWidthRamp(int[] nums) {
        // i<j && nums[i]<=nums[j]
        int max = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                  if(nums[j]-nums[i]>max) max = j-i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] area = {18,7,93,37,86,39,51,60,104,35,61,48,28,46,40,16,59,96,12,10,66,71,19,49,44,23,83,64,33,3,7,14,54,40,47,71,43,53,7,63,45,24,53,39,41,27,65,35,16,50,30,42,6,16,14,41,1,42,45,50,23,5,47,27,12,38,23,49,38,45,48,44,19,39,22,13,14,22,35,7,11,23,34,27,33,1,18,7,15,3,0,4,6,25,7,17,11,10,13,9,6,3,8,8,4,3,7,4,9,3,0,6,0,5,4,0,2,1,0};
        System.out.println(maxWidthRamp(area));
    }
}
