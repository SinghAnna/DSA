public class TernarySearch {

    // ternary search algorithm implementation its is used for sorted array
    // time complexity O(log3 n)
    // space complexity O(1)
    
    static int ternarySearch(int[] arr, int target){

        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;
            
            if (arr[mid1] == target)  return mid1;
            if (arr[mid2] == target)  return mid2;

            if (arr[mid1] > target) {
                end = mid1 - 1;
            }else if (arr[mid2] < target) {
                start = start + mid2;
            }else{
                start = mid1 + 1;
                end = mid2 - 1;
            }
            
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 12, 15, 18, 24, 35, 56, 58, 67, 69 };
        int rs = ternarySearch(arr, 24);

        if (rs != -1) {
            System.out.println("Value is exist at index : " + rs);
        } else {
            System.out.println("Value is not exist!");
        }
    }
}
