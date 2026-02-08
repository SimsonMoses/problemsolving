package stream;

public class FindFirstNonRepeatedCharacterInString {
    public static void main(String[] args) {
        String input = "simson";
        Character result = input.chars()
                .mapToObj(c-> (char) c)
                .filter(c->input.indexOf(c)==input.lastIndexOf(c))
                .findFirst()
                .orElse(null);
        System.out.println("First Non-Repeated Character: "+result);
    }
}
