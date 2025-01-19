package medium;

public class MininumLengthOfStringAfterOperation {
    public static void main(String[] args) {
        MininumLengthOfStringAfterOperation mininumLengthOfStringAfterOperation = new MininumLengthOfStringAfterOperation();
        String s = "abaacbcbb";
        System.out.println(mininumLengthOfStringAfterOperation.minimumLength(s));
    }
    public int minimumLength(String s) {
        int freq[] = new int[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int n = s.length() - 1;
        int count = 0;
        for(int i=0;i<n;i++){
            if(freq[s.charAt(i)-'a']>=3){
                int temp = freq[s.charAt(i)-'a']/3;
                freq[s.charAt(i)-'a'] = freq[s.charAt(i)-'a']-temp*2;
            }
        }
        for(int i=0;i<26;i++){
                count+=freq[i];
        }
        return count;
    }
}
