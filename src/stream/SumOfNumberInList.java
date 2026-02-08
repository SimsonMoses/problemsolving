package stream;

import java.util.List;

public class SumOfNumberInList {
    public static void main(String[] args) {
        var numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        var sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of numbers: "+sum);
    }
}
