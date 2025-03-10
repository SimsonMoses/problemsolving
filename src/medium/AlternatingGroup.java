package medium;

public class AlternatingGroup {
    public static void main(String[] args) {

    }

    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int temp[] = new int[n+k-1];
        System.arraycopy(colors, 0, temp, 0, n);
        System.arraycopy(colors, 0, temp, n, k-1);
        int ans = 0;
        int left = 0, right = k;
        while(left<right){
            boolean flag = true;
            for(int i=left+1;i<=right;i++){
                if(temp[i]==temp[i-1]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans++;
                left++;
                right++;
            }
        }
        return ans;
    }

}
