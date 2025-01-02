package easy;


import java.util.ArrayList;
import java.util.List;

public class CheckNIsDoubleExists {

    public static boolean checkIfExist(int[] arr) {
        List<Integer> list = new ArrayList();
        for (int i : arr) {
            list.add(Math.abs(i * 2));
        }
        for (int i = 0; i < arr.length; i++) {
            int num = list.remove(i);
            if (list.contains(arr[i])) {
                return true;
            }
            list.add(i, num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));
    }
}
