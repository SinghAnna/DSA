public class InterpolationSearch {

    // interpolation search algorithm implementation its is used for sorted array
    // time complexity O(log log n) in best case
    // space complexity O(1)
    //for uniformly distributed data and formula based searching 
    //formula is location = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);
    
    static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && target >= arr[low] && target <= arr[high]) {
            
           
            if (arr[high] == arr[low]) {
                if (arr[low] == target) {
                    return low;
                } else {
                    return -1;
                }
            }

       
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);

  
            if (arr[pos] == target) {
                return pos;
            }

     
            if (arr[pos] < target) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

    
        return -1;
    }

    public static void main(String[] args) {
     
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int target = 70;
        int result = interpolationSearch(arr, target);

        if (result != -1) {
            System.out.println("Value exists at index: " + result);
        } else {
            System.out.println("Value does not exist in the array!");
        }
    }
}
