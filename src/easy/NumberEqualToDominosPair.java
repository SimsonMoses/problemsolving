package easy;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberEqualToDominosPair {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < dominoes.length; i++) {
            List<Integer> list = Arrays.asList(dominoes[i][0], dominoes[i][1]);
            if (map.containsValue(list)) {
                ans++;
            } else {
                map.put(i, list);
            }
        }
        return ans;
    }


    public static void main(String[] args) {

    }
}
