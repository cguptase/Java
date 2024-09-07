package sorting;

import java.util.Arrays;

// time complexity
// O(n^2)->worstCase
// O(n^2)->averageCase
// O(n)->bestCase

// space complexity
// O(1)

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 4, 6, 0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
