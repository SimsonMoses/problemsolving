package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        String s = "soijfsko";
        List<Character> list = new ArrayList<>();

        for(char ch : s.toCharArray()){
            list.add(ch);
        }
        list = list.stream().sorted().toList();
        System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining()));

    }
}
