package basics;

import java.lang.reflect.Array;

public class MergeSort {

    // Merge Sort
    // l    -   left index
    // m    -   middle index
    // r    -   right index
    public static void mergeSort(int[] arr, int l, int r){
        if(r > l){

            // Find the middle point
            int m = (l+r)/2;

            // Split on the left
            mergeSort(arr, l, m);

            // Split on the right
            mergeSort(arr, m+1, r);

            // Merge two sub-array
            merge(arr, l, m, r);
        }
    }

    // Merge the two sub-array
    private static void merge(int[] arr, int l, int m, int r){
        // Find size of two sub-arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Init two empty array
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to tmp array
        for (int j = 0; j < n1; j++) {
            leftArray[j] = arr[l+j];
        }

        for (int i = 0; i < n2; i++) {
            rightArray[i] = arr[m+1+i];
        }

        // Index initializing
        int i = 0, j = 0, k = l;

        // Point-wise crossing compare
        while (i < n1 && j < n2){
            if(leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            }else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remain of the left sub-array
        while (i < n1){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remain of the right sub-array
        while (j < n2){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
