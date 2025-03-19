package medium;

public class NumberOfSubString {
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("cbacba"));
    }

    public static int numberOfSubstrings(String s) {
        int subSeqCount = 0;
        for (int left = 0; left <= s.length() - 2; left++) {
            int right = left + 2;
            while (right <= s.length()) {
                String sub = s.substring(left, right);
                // contain abc in any order
                if (sub.indexOf('a')!=-1 && sub.indexOf('b')!=-1 && sub.indexOf('c')!=-1) {
                    subSeqCount++;
                    subSeqCount = subSeqCount + ( s.length() - right);
                    break;
                }
                right++;
            }
        }
        return subSeqCount;
    }
}
