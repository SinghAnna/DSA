public class BinarySearch {
    // method 1 using loop
    // time complexity O(log n)
    // space complexity O(1)
    
    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }

    // method 2 using Recursive Approach
    static int binarySearchRecursive(int[] arr, int start, int end, int target) {

        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, mid + 1, end, target);
        } else {
            return binarySearchRecursive(arr, start, mid - 1, target);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 12, 15, 18, 24, 35, 56, 58, 67, 69 };
        int rs = binarySearch(arr, 24);

        int rrs = binarySearchRecursive(arr, 0, arr.length - 1, 24);

        if (rs != -1) {
            System.out.println("Value is exist at index : " + rs);
        } else {
            System.out.println("Value is not exist!");
        }

        if (rrs != -1) {
            System.out.println("Value is exist at index : " + rrs);
        } else {
            System.out.println("Value is not exist!");
        }
    }
}
