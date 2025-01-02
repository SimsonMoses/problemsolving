package medium;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**https://leetcode.com/problems/count-vowel-strings-in-ranges/
 * */
public class CountVowelsInRange {
    public static void main(String[] args) {
        CountVowelsInRange countVowelsInRange = new CountVowelsInRange();
        String[] words = {"aba","bcb","ece","aa","e"};
        int[][] queries = {{0,2},{1,4},{1,1}};
        int[] result = countVowelsInRange.vowelStrings(words, queries);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
//        HashMap<Integer,Integer> hasVowel = new HashMap();  // 0 no vowel, 1 has vowel
        int[] hasVowelArray = new int[words.length];
        int i =0;
        for (String word : words) {
            hasVowelArray[i] = isVowel(word) ? 1 : 0;
            i++;
        }
        int[] result = new int[queries.length];
        i = 0;
        for (int[] query : queries) {
            int count = 0;
            for (int j = query[0]; j <= query[1]; j++) {
                count += hasVowelArray[j];
            }
            result[i] = count;
            i++;
        }
        return result;
    }

    public boolean isVowel(String s){
        return isVowel(s.charAt(0)) && isVowel(s.charAt(s.length()-1));
    }
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
