package easy;

class LongestPalindromicSubstringSolution {
    public boolean isPalindrome(int x) {
        StringBuilder str = new StringBuilder(String.valueOf(x));
        String rev = str.toString();
        str.reverse();
        if(str.toString().equals(rev)){
            return true;
        }
        return false;
    }
}

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        LongestPalindromicSubstringSolution l = new LongestPalindromicSubstringSolution();
        System.out.println(l.isPalindrome(-121));
    }
}
