package medium;

class SolutionSor {
    public void sortColors(int[] nums) {
        int[] countArray = new int[3];
        for(int n:nums){
            countArray[n]++;
        }
        for(int n:countArray){
            System.out.print(n);
        }
        int j=0;
        if(nums.length>=3){
            for(int i=0;i<nums.length;i++){
                if(countArray[j]==0)
                    j++;
                nums[i] = j;
                countArray[j]--;
            }
        }
        if(nums.length==2){
            if(nums[0]>nums[1]){}
            int temp = nums[1];
            nums[1] = nums[0];
            nums[0] = temp;
        }
    }
}


public class SortColors {
    public static void main(String[] args) {

    }
}
