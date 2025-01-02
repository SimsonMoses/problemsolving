package easy;

public class PrefixWordExists {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        PrefixWordExists prefixWordExists = new PrefixWordExists();
        String sentence = "i love eating burger";
        String searchWord = "burg";
        System.out.println(prefixWordExists.isPrefixOfWord(sentence, searchWord));
    }
}
