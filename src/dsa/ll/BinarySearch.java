package dsa.ll;

public class BinarySearch {
    static boolean binarySearch(int arr[], int x) {
        int l = 0;
        int r = arr.length;
        while (l <= r) {
            int mid = l + (r + l) / 2;
            if (arr[mid] == x) {
                return true;
            }
            if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearch(arr, 5));
    }
}
