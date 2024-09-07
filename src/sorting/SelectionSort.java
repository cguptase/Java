package sorting;

import java.util.Arrays;

// time complexity
// O(n^2)->worstCase
// O(n^2)->averageCase
// O(n^2)->bestCase

// space complexity
// O(1)

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 4, 6, 0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
}
