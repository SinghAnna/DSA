public class LinearSearch {
    // linear search algorithm implementation its is used for unsorted array
    // time complexity O(n) 
    // space complexity O(1)
    static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 7, 5, 9, 1, 2, 9, 10, 58 };
        int rs = linearSearch(arr, 12);

        if (rs != -1) {
            System.out.println("Value is exist at index : " + rs);
        } else {
            System.out.println("Value is not exist!");
        }
    }
}