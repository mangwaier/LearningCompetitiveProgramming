package basics;

public class PrintArray {

    public static void printArray(int[] arr) {
//        System.out.print("Target array: ");
        for (int i = 0; i < arr.length - 1; ++i) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length-1]);
    }
}
