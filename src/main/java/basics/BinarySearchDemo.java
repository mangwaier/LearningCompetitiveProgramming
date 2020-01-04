package basics;

import java.util.Scanner;

public class BinarySearchDemo {

    public static void main(String[] args){
        int[] arr = {2, 5, 10, 12};
        int n = arr.length;
        PrintArray.printArray(arr);
        Scanner s = new Scanner(System.in);
        System.out.print("Input x: ");
        int x = s.nextInt();
//        int index = BinarySearch.recursiveBinarySearch(arr, 0, n-1, x);
        int index = BinarySearch.iterativeBinarySearch(arr, x);
        System.out.println("Index of " + x + " is: " + index);
    }
}
