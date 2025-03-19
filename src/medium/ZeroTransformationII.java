package medium;

public class ZeroTransformationII {
    public static void main(String[] args) {
//        int nums[] = new int[]{8,4};
//        int queries[][] = new int[][]{{0,1,5}, {1,1,5}, {1,1,3},{1,1,4},{0,0,3},{1,1,4},{0,1,2}};
        int nums[]  = new int[]{2,0,2};
        int queries[][] = new int[][]{{0,2,1},{0,2,1},{1,1,3}};
        System.out.println(minZeroArray(nums, queries));

    }

    public static int minZeroArray(int[] nums, int[][] queries) {
        // iterate over queries
        // decrea the nums by value to range
        // check the zero array
        int n = nums.length;
        int k = 0;
        boolean found = true;
        int z =0;
        for (int j = 0; j < n; j++) {
            if (nums[j] != 0 ) {
                z++;
                found = false;
            }
        }
        if(found){
            return 0;
        }
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int value = queries[i][2];
            int zeroCount = 0;

            for (int j = left; j <= right; j++) {
                int temp = nums[j];
                if(nums[j]>0 ){
                    if(value>nums[j])
                        nums[j]=0;
                    else
                        nums[j] -= value;
                }
                if(temp!=0 && nums[j]==0){
                    z--;
                }
            }

            k++;
//            for (int j = 0; j < n; j++) {
//                if (nums[j] == 0) {
//                    zeroCount++;
//                }
//            }
//            if (zeroCount == n) {
//                return k;
//            }
            if(z==0){
                return k;
            }

        }
        return -1;
    }
}
