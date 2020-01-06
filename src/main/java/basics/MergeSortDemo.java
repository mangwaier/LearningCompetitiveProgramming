package basics;

public class MergeSortDemo {

    public static void main(String[] args){
        int[] arr = {2, 17, 20, 12, 3};
        int n = arr.length;
        System.out.print("Before sorted:");
        PrintArray.printArray(arr);
        MergeSort.mergeSort(arr, 0, n-1);
        System.out.print("After sorted:");
        PrintArray.printArray(arr);
    }

}
