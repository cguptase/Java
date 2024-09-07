package searching;

// time complexity -> O(log n)
// space complexity ->O(1)

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 8};
        int key = 0;
        binarySearch(arr, key, 0, arr.length - 1);
    }

    public static void binarySearch(int[] arr, int key, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                System.out.println("element found on " + mid + " index");
                return;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            }
        }
        System.out.println("element not found");
    }
}
