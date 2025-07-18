package dsa.striver.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceEqualSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int target = 5;
        SubSequenceEqualSum subsequenceEqualSum = new SubSequenceEqualSum();
        subsequenceEqualSum.solveOne(0, new ArrayList<>(), arr, 0, target);
    }

    public void solve(int index, List<Integer> list, int arr[], int sum, int target) {
        if (sum == target) {
            System.out.println(list);
            return;
        }
        if (index == arr.length) {
            return;
        }
        list.add(arr[index]);
        sum += arr[index];
        solve(index + 1, list, arr, sum, target);
        list.remove(list.size() - 1);
        sum -= arr[index];
        solve(index + 1, list, arr, sum, target);
    }

    // solve to print only one subsequence
    public boolean solveOne(int index,List<Integer> list, int[] arr,int sum, int target){
        if(sum== target){
            System.out.println(list);
            return true;
        }
        if(index==arr.length){
            return false;
        }
        list.add(arr[index]);
        sum += arr[index];
        if(solveOne(index+1, list, arr, sum, target)){
            return true;
        }
        list.remove(list.size() - 1);
        sum -= arr[index];
        if (solveOne(index+1, list, arr, sum, target)){
            return true;
        }
        return false;
    }
}
