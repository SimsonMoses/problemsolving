package easy;


import java.util.Arrays;
import java.util.List;

class SolutionRelativeSort {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        List<Integer> ar2 = List.of(Arrays.stream(arr2).boxed().toArray(Integer[]::new));
        List<Integer> ar = new java.util.ArrayList<>(List.of(Arrays.stream(arr1).boxed().toArray(Integer[]::new)));
        int ans[] = new int[arr1.length];
        int ine = 0;
        for (Integer arTwo : ar2) {
            while (ar.contains(arTwo)) {
                ans[ine] = arTwo;
                ine++;
                ar.remove(arTwo);
            }
        }
        for (Integer arOne : ar) {
            ans[ine] = arOne;
            ine++;
        }
        return ans;
    }
}

public class RelativeSortArray {
    public static void main(String[] args) {
        int arr1[] = new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int arr2[] = new int[]{2, 1, 4, 3, 9, 6};
        SolutionRelativeSort solutionRelativeSort = new SolutionRelativeSort();
        System.out.println(Arrays.toString(solutionRelativeSort.relativeSortArray(arr1, arr2)));
    }
}
