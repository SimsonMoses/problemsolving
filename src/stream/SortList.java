package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list = List.of(9,7,4,32,5,7,8,5,3,3);
        list = list.stream().sorted().toList();
        list = list.stream().sorted(Comparator.reverseOrder()).toList(); // reverse sorting
        System.out.println("Sorted List: "+list);
    }
}
