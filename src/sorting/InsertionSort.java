package sorting;

import java.util.Arrays;

// time complexity
// O(n^2)->worstCase
// O(n^2)->averageCase
// O(n)->bestCase

// space complexity
// O(1)

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 4, 6, 0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
