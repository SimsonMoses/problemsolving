package medium;

import java.util.HashMap;
import java.util.Locale;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // append character one by one in variable
        // check whether char present in variable
        // check length var each iteration and store the max value
        String temp = "";
        s = s.trim();
        if(s==null||s.isEmpty()){
            return 0;
        }else if (s.length() <= 1)
            return 1;
        int max = 0;
        for (char ch : s.toCharArray()) {
            if (temp.indexOf(ch)>=0) {
                temp = temp.substring(temp.lastIndexOf(ch)==temp.length()-1?temp.length():temp.lastIndexOf(ch)-1);
                temp+=ch;
                continue;
            }
            temp+=ch;
            if(temp.length()>max){
                max = temp.length();
            }
        }
        return max;
    }
    public int lengthOfLongestSubstring01(String s){
        // using the two pointer variable

        int left=0,right=0,maxlen=0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<Character ,Integer>();
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(left,map.get(s.charAt(right))+1);
                map.put(s.charAt(right),right);
            }else{
                map.put(s.charAt(right),right);
            }
            maxlen = Math.max(maxlen,(right-left+1));
            right++;
        }
        return maxlen;
    }
}

public class LongestSubstringWithoutReaptingCharacter {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring01("dvdf"));
    }
}
