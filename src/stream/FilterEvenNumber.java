package stream;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(9,7,4,32,5,7,8,5,3,3);
        System.out.println("Even Numbers: "+numbers.stream().filter(n->n%2==0).toList());
    }
}
