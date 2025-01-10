package easy;

public class PrefixSuffixString {

    public static void main(String[] args) {
        PrefixSuffixString prefixSuffixString = new PrefixSuffixString();
        String[] words = {"a","aba","ababa","aa"};
        System.out.println(prefixSuffixString.countPrefixSuffixPairs(words));
    }

    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i<j && isPrefixAndSuffix(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isPrefixAndSuffix(String s2,String s1){
        return s1.startsWith(s2) && s1.endsWith(s2);
    }
}
