package easy;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] words = {"cir", "car"};
        System.out.println(longestCommonPrefix.longestCommonPrefix(words));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String ans = "";
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            boolean temp = false;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() > i && c == strs[j].charAt(i)) {
                    temp = true;
                } else {
                    temp = false;
                    break;
                }
            }
            if (temp) {
                ans = strs[0].substring(0, i + 1);
            } else {
                break;
            }
        }
        return ans;
    }

}
