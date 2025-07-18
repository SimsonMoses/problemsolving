package dsa.striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsequences {

    public static void main(String[] args) {
        int [] arr = {3, 1, 2};
        PrintSubsequences ps = new PrintSubsequences();
        ps.solve(0, new ArrayList<>(), arr, arr.length);
    }

    public void solve(int index, List<Integer> list, int[]arr, int n){
        if(index == n){
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        solve(index + 1, list, arr, n);
        list.remove(list.size() - 1);
        solve(index + 1, list, arr, n);
    }

}
