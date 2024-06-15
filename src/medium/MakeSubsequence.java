package medium;


class SolutionA {
    public int appendCharacters(String s, String t) {
        int num = 0;
        if(s.length()<t.length()){
            return t.length();
        }
        if(s.contains(t))
            return 0;
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
        }
        return num-j;
    }
    public static int appendCharacter(String s, String t) {
        int i = 0, j = 0;
        int sLen = s.length(), tLen = t.length();

        while (i < sLen && j < tLen) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }

        return tLen - j;
    }
}

public class MakeSubsequence {
    public static void main(String[] args) {
        SolutionA solution = new SolutionA();
        System.out.println(solution.appendCharacters("coaching","coding"));
    }
}
