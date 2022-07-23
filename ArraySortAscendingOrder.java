import java.util.*;

public class ArraySortAscendingOrder {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int Size = sc.nextInt();
        int[] arr = new int[Size];

        // input
        for (int i = 0; i < Size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < arr.length - 1; i++) { // NOTICE numbers.length - 1 as termination condition
            if (arr[i] > arr[i + 1]) { // This is the condition for descending order
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

    }
}
