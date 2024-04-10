package easy;

import java.util.Arrays;
import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        List<String> rule = Arrays.asList("type","color","name");
        int key = rule.indexOf(ruleKey);
        int count=0;
        for(List list: items){

            if(list.get(key).equals(ruleValue))
                count++;
        }
        return count;
    }

    public int countMatches01(List<List<String>> items, String ruleKey, String ruleValue) {
        List<String> rule = Arrays.asList("type","color","name");
        int key = rule.indexOf(ruleKey);

        return (int) items.stream().filter(list->list.get(key).equals(ruleValue)).count();
    }

}

public class RuleMatching {
}
