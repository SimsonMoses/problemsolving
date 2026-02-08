package stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementInList {
    public static void main(String[] args) {
        var numbers = List.of(1,2,3,4,5,6,7,8,9,10,1,2,3);
        Set<Integer> duplicates = numbers.stream()
                .filter(n->numbers.indexOf(n)!=numbers.lastIndexOf(n))
                .collect(Collectors.toSet());
        System.out.println("Duplicate Elements: "+duplicates);
    }
}
