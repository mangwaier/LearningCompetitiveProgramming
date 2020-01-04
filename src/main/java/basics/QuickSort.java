package basics;

public class QuickSort {

    // In-place Recursive Quick Sort
    // low  -   starting index
    // high -   ending index
    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr,pivotIndex+1, high);
        }
    }

    // Take last element as pivot and put it at the correct position
    // all smaller element are on the left and
    // all bigger element are on the right
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1; // Tracking the index of smaller element
        for (int j = low; j <= high-1; ++j) {
            if(arr[j] < pivot){
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        i++;

        // Put it at the correct position
        int tmp = arr[i];
        arr[i] = pivot;
        arr[high] = tmp;

        return i;
    }
}
