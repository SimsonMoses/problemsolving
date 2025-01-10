package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsSubset {

    public static void main(String[] args) {

    }

    public List<String> wordSubsets(String[] words1, String[] words2) {
        int temp[] = new int[26];
        int max[] = new int[26];

        for(String word: words2){
            Arrays.fill(temp, 0);
            for(char c: word.toCharArray()){
                temp[c-'a']++;
            }
            for(int i = 0; i < 26; i++){
                max[i] = Math.max(max[i], temp[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for(String word: words1){
            Arrays.fill(temp,0);
            for(char c: word.toCharArray()){
                temp[c-'a']++;
            }
            boolean isUniversal = true;
            for(int i=0;i<26;i++){
                if(temp[i] < max[i]){
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                ans.add(word);
            }
        }
        return ans;
    }
}
