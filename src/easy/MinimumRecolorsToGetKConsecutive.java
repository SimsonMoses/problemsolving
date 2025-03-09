package easy;

public class MinimumRecolorsToGetKConsecutive {
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(minimumRecolors(blocks, k));
    }

    public static int minimumRecolors(String blocks, int k) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < blocks.length(); i++) {
            if (i + k > blocks.length()) {
                break;
            }
            String s = blocks.substring(i, i + k);
            int wCount = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'W') {
                    wCount++;
                }
            }
            min = Math.min(min, wCount);
        }
        return min;
    }
}
