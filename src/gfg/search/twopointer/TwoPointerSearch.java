package gfg.search.twopointer;

public class TwoPointerSearch {
    public static boolean twoPointerSearch(int[] arr,int l, int r,int x){
        while(l<=r){
            if(arr[l]+arr[r] == x){
                return true;
            } else if (arr[l]+arr[r]<x) {
                l++;
            }else{
                r++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int l = 0;
        int r = arr.length-1;
        int x = 15;
        boolean result = twoPointerSearch(arr,l,r,x);
        System.out.println("Is the element present : "+result);
    }
}
