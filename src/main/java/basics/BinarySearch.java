package basics;

public class BinarySearch {

    // Recursive Binary Search
    // arr  -   a non-empty sorted array
    // l    -   start index on the left
    // r    -   stop index on the right
    // if x exists in the sorted array - return the index
    // else - return -1
    public static int recursiveBinarySearch(int[] arr, int l, int r, int x){
        if(r>=1){
            int middle = l + (r - l) / 2;
            if(x == arr[middle]) return middle;

            // Only exists in the left of array
            if(x > arr[middle]) return recursiveBinarySearch(arr, middle+1, r, x);

            // Only exists in the right of array
            if(x < arr[middle]) return recursiveBinarySearch(arr, l, middle-1, x);
        }

        // For one-element array
        if(x == arr[0]) return 0;
        return -1;
    }

    // Iterative Binary Search
    // arr  -   a non-empty sorted array
    public static int iterativeBinarySearch(int[] arr, int x){
        int l = 0, r = arr.length -1;
        while (l <= r){
            int middle = l + (r - l) / 2;
            if(x == arr[middle]) return middle;
            if(x > arr[middle]) l = middle + 1;
            if(x < arr[middle]) r = middle - 1;
        }
        return -1;
    }
}
