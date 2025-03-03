package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniquelengthPanlidrome {

    public static void main(String[] args) {
        String s = "aabca";
        UniquelengthPanlidrome uniquelengthPanlidrome = new UniquelengthPanlidrome();
        System.out.println(uniquelengthPanlidrome.countPalindromicSubsequence(s));
    }

    public int countPalindromicSubsequence(String s) {
        Set<Character> letters = new HashSet();
        for (Character c: s.toCharArray()) {
            letters.add(c);
        }

        int ans = 0;
        for (Character letter : letters) {
            int i = -1;
            int j = 0;

            for (int k = 0; k < s.length(); k++) {
                if (s.charAt(k) == letter) {
                    if (i == -1) {
                        i = k;
                    }

                    j = k;
                }
            }

            Set<Character> between = new HashSet();
            for (int k = i + 1; k < j; k++) {
                between.add(s.charAt(k));
            }

            ans += between.size();
        }

        return ans;
    }
}
