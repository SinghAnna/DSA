public class JumpSearch {
    // jump search algorithm implementation its is used for sorted array
    // time complexity O(√n)
    // space complexity O(1) 

    static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (prev >= n) {
                return -1;
            }
        }

        for (int i = prev; i < Math.min(step, n); i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
           int[] arr = { 3, 5, 7, 9, 12, 15, 18, 24, 35, 56, 58, 67, 69 };
        int rs = jumpSearch(arr, 24);
        if (rs != -1) {
            System.out.println("Value is exist at index : " + rs);
        } else {
            System.out.println("Value is not exist!");
        }
    }
}
