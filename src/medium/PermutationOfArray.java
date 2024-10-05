package medium;

import java.util.Arrays;

class PermutationSolution{

    // get freq static method
    public static int[] getFreq(String s,int l, int r){
        int freq[] = new int[26];
        for(int i=l;i<r;i++){
            freq[s.charAt(i)-'a']++;
        }
        return freq;
    }
    public boolean checkInclusion(String s1, String s2) {
        // check the len
        int n1 = s1.length(),n2 = s2.length();
        if(n1>n2){
            return false;
        }
        // first store the freq of characters in freq
        int freq1[] = getFreq(s1,0,n1);
        int freq2[] = getFreq(s2,0,n1);
        if(Arrays.equals(freq2, freq1)){
            return true;
        }
        // then iterate over the string s2 with sliding window of length technique
        // then check if the freq of the characters in the window is equal to the freq of the characters in s1
        for(int l=1,r=n1;r<n2;l++,r++){
            freq2[s2.charAt(l-1)-'a']--;
            freq2[s2.charAt(r)-'a']++;
            if(Arrays.equals(freq1, freq2)){
                return true;
            }
        }
        return false;
    }
}


public class PermutationOfArray {
    public static void main(String[] args) {
        String str = "ab";
        String str2 = "eidbaooo";
        PermutationSolution solution = new PermutationSolution();
        System.out.println(solution.checkInclusion(str,str2));
    }
}
