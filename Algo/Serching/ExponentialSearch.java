public class ExponentialSearch {
        // binary search
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

    // exponential search it is used for sorted array
    // time complexity O(log n) 
    // space complexity O(1)
    static int exponentialSearch(int[] arr, int target){
        int n = arr.length;

        if (arr[0] == target) return 0;
        // step 1 find the range
        int i = 1;
        while (i < n && arr[i] <= target) {
            i = i * 2;
        }

        //step 2 : binary search in found in range
        return binarySearchRecursive(arr, i/2,Math.min(i,n-1),target);
    }


    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 12, 15, 18, 24, 35, 56, 58, 67, 69 };

        int rs = exponentialSearch(arr, 24);
        
        if (rs != -1) {
            System.out.println("Value is exist at index : " + rs);
        } else {
            System.out.println("Value is not exist!");
        }
    }
}
