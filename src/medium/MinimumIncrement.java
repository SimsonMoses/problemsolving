package medium;
class SolutionMin {
    public int minIncrementForUnique(int[] nums) {
        int countArray[] = new int[10000];
        for (int i = 0; i < nums.length; i++) {
            countArray[nums[i]]++;
        }
        int nextValue = 1;
        int count = 0;
        while (countArray[nextValue] != 0){
            nextValue++;
        }
        for(int i=0;i<nums.length;i++){
            if(countArray[nums[i]]>1){
                countArray[nums[i]]--;
                count += Math.abs(nums[i]-nextValue);
                nums[i]=nextValue;
                nextValue++;
                while (countArray[nextValue] != 0){
                    nextValue++;
                }
            }
        }
        return count;
    }
}
public class MinimumIncrement {
    public static void main(String[] args) {
        SolutionMin solutionMin = new SolutionMin();

        solutionMin.minIncrementForUnique(new int[]{1,3,0,3,0});
    }
}
