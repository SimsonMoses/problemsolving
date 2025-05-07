package medium;

public class MinimumOperationToMakeBinaryToOne {
    public static void main(String[] args) {

    }

    public int minOperations(int[] nums) {
        int count[] = new int[2];
        int c = 0;
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
                if(i+2>n){
                    return -1;
                }
                for(int j=i;j<n && j<i+2;j++){
                    if(nums[j]==0){
                        nums[j]=1;
                    }else{
                        nums[j]=0;
                    }
                }
            }
            count[nums[i]]++;
        }
        return nums[0]==0?c:-1;
    }
}
