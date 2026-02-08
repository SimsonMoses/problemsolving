package stream;

import java.util.List;

public class CheckifAnyStringMatchesACondition {
    public static void main(String[] args) {
        List<String> names = List.of("java", "python", "c++", "javascript","stream api");
        String searchString = "api";
        boolean anyMatch = names.stream().anyMatch(s->s.contains(searchString));
        System.out.println("Is there any string that matches '"+searchString+"'? "+anyMatch);
    }
}
