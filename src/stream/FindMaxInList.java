package stream;

import java.util.List;

public class FindMaxInList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(9,7,4,32,5,7,8,5,3,3);
        Integer maxNumber = numbers.stream().reduce((a,b)->a>b?a:b).orElse(null);
        System.out.println("Max Number: "+maxNumber);
    }
}
