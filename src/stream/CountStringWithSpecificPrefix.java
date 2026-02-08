package stream;

import java.util.Arrays;
import java.util.List;

public class CountStringWithSpecificPrefix {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        String prefix = "Al";
        long count = names.stream().filter(n->n.startsWith(prefix)).count();
        System.out.println("Number of names starting with '"+prefix+"': "+count);
    }
}