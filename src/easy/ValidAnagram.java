package easy;

import java.util.Arrays;
import java.util.Hashtable;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(validAnagram.isAnagram(s,t));
    }


    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);

        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[sArray[i]-'a']++;
            freq[tArray[i]-'a']--;
        }

        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
