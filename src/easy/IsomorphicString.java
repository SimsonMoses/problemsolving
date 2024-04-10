package easy;

import java.util.HashMap;
import java.util.Map;

class SolutionIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if(!map.get(s.charAt(i)).equals(t.charAt(i)))
                    return false;
            } else {
                if(map.containsValue(t.charAt(i)))
                    return false;
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}

public class IsomorphicString {
    public static void main(String[] args) {
        SolutionIsomorphic solutionIsomorphic = new SolutionIsomorphic();
        boolean asn = solutionIsomorphic.isIsomorphic("badc","baba");
        System.out.println(asn);
    }
}
