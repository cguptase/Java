package searching;

// time complexity -> O(n)
// space complexity ->O(1)

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 6, 8};
        int key = 6;
        linearSearch(arr, key);
    }

    public static void linearSearch(int[] arr, int key) {
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                bool = true;
                System.out.println("index of given number " + key + " is " + i);
            }
        }
        if (!bool) {
            System.out.println("element is not found");
        }
    }
}
