package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        // hash table
        Hashtable<String, Integer> ht = new Hashtable<>();
        List<List<String>> list = new ArrayList<>();
        for(String str: strs){
            // check hash contains
            char[] ar = str.toCharArray();
            Arrays.sort(ar);
            String sorted = String.valueOf(ar);
            if(ht.containsKey(sorted)){
                int index = ht.get(sorted);
                List<String> l = list.get(index);
                l.add(str);
                list.set(index, l);
            }else{
                ht.put(sorted,list.size());
                list.set(ht.get(sorted),new ArrayList<>(List.of(str)));
            }
        }
        return list;
    }

    public static void main(String[] args) {



    }
}
