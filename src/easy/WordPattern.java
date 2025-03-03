package easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog dog dog dog"));
    }

    public static boolean wordPattern(String pattern, String s) {

        Map<String,String>  map = new HashMap<>();
        String [] key = pattern.split("");
        String [] value = s.split(" ");
        if(key.length!=value.length){
            return false;
        }
        for(int i=0;i< key.length;i++){
            if(map.get(key[i])==null ) {
                if(map.containsValue(value[i])){
                    return false;
                }
                map.put(key[i], value[i]);
            }else {
                if(!map.get(key[i]).equals(value[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
