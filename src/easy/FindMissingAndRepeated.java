package easy;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingAndRepeated {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,3,9,7},{16,4,13,15},{2,14,5,11},{14,6,10,8}};
        int[] ans = findMissingAndRepeatedValues(grid);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int row = grid[0].length;
        int n = row * row;
        List<Integer> numbers = IntStream.rangeClosed(1, n)
                .boxed()
                .collect(Collectors.toList());
        int ans[] = new int[2];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (numbers.contains(grid[i][j])) {
                    numbers.remove(Integer.valueOf(grid[i][j]));
                } else {
                    ans[0] = grid[i][j];
                }
            }
        }
        ans[1] = numbers.get(0);
        return ans;
    }
}
