package medium;

import java.util.HashMap;
import java.util.Map;

public class CountOfSubstringContainingVowel {
    public static void main(String[] args) {
        System.out.println(countSubstrings("iqeaouqi", 2));
    }

//    public static long countOfSubstring(String word, int k) {
//        int left = 0, ans = 0;
//        int right = 5 + k;
//        int wordcount = right;
//        int n = word.length();
//        if (n <= right) {
//            return 0;
//        }
//        while (left < right - k) {
//            String temp = word.substring(left, right);
//            if (containsVowelAndKConsonant(temp, wordcount, k)) {
//                ans++;
//            }
//            left++;
//            right++;
//            if (right>=n) {
//                break;
//            }
//        }
//        return ans;
//    }
//
//    public static boolean containsVowelAndKConsonant(String str, int k, int minCons) {
//        str = str.toLowerCase();
//        int vowelCount = 0, consonantCount = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                vowelCount++;
//            } else if (consonantCount < minCons) {
//                consonantCount++;
//            }
//        }
//        return vowelCount + consonantCount == k;
//
//    }

    public static int countSubstrings(String word, int k) {
        int n = word.length();
        int count = 0;

        for (int left = 0; left < n; left++) {
            Map<Character, Integer> vowelCount = new HashMap<>();
            int consonantCount = 0;

            for (int right = left; right < n; right++) {
                char ch = word.charAt(right);

                if (isVowel(ch)) {
                    vowelCount.put(ch, vowelCount.getOrDefault(ch, 0) + 1);
                } else {
                    consonantCount++;
                }

                if (vowelCount.size() == 5 && consonantCount == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public long countOfSubstrings(String word, int k) {
        int[][] frequencies = new int[2][128];
        frequencies[0]['a'] = 1;
        frequencies[0]['e'] = 1;
        frequencies[0]['i'] = 1;
        frequencies[0]['o'] = 1;
        frequencies[0]['u'] = 1;

        long response = 0;

        int currentK = 0;
        int vowels = 0;
        int extraLeft = 0;
        for (int right = 0, left = 0; right < word.length(); right++) {
            char rightChar = word.charAt(right);

            if (frequencies[0][rightChar] == 1 && ++frequencies[1][rightChar] == 1) {
                vowels++;
            } else if (frequencies[0][rightChar] == 0) {
                currentK++;
            }

            while (currentK > k) {
                char leftChar = word.charAt(left);

                if (frequencies[0][leftChar] == 1 && --frequencies[1][leftChar] == 0) {
                    vowels--;
                } else if (frequencies[0][leftChar] == 0) {
                    currentK--;
                }
                left++;
                extraLeft = 0;
            }

            //try to shrink
            while (vowels == 5 && currentK == k && left < right && frequencies[0][word.charAt(left)] == 1 && frequencies[1][word.charAt(left)] > 1) {
                extraLeft++;
                frequencies[1][word.charAt(left)]--;
                left++;
            }

            if (currentK == k && vowels == 5) {
                response++;
                response += extraLeft;
            }
        }

        return response;
    }

    private static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }

}
