package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringByLength {
    public static void main(String[] args) {
        List<String> list = List.of("java", "python", "c++", "javascript","stream api");
        Map<Integer,List<String>> groupedByLength = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped by Length: "+groupedByLength);

    }
}
