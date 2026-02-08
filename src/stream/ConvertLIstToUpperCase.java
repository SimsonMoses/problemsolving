package stream;

import java.util.List;

public class ConvertLIstToUpperCase {
    public static void main(String[] args) {
        var list = List.of("java", "python", "c++", "javascript");
        var uppperCaseList = list.stream().map(String::toUpperCase).toList();
        System.out.println(uppperCaseList);
    }
}
