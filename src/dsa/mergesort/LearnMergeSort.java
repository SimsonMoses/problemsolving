package dsa.mergesort;

public class LearnMergeSort {



    static void mergeSort(int[] arr, int left, int right,int mid){

        // initializing th two sub arrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // create temp array
        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy data to temp arrays
        for(int i=0;i<n1;i++){

            L[i] = arr[left+i];
        }
        for(int j=0;j<n2;++j)
            R[j] = arr[mid+j+1];

        int i=0,j=0;
        int k = left;

        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k] = L[i];
                i++;
            }else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
    // copy remaining elements of
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[],int left, int right){
        if(left<right){
            int m = left + (right - left)/2;
            sort(arr,left,m);
            sort(arr,m+1,right);
            mergeSort(arr,left,right,m);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        System.out.println("Given array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sort(arr,0,n-1);
        System.out.println("Sorted array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
