import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTwoPointer {

      static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Step 1: sort array
        List<List<Integer>> res = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Step 2: Avoid duplicate "i"
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Step 3: Skip duplicates for left and right
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } 
                else if (sum < 0) {
                    left++; // need bigger sum
                } 
                else {
                    right--; // need smaller sum
                }
            }
        }
        
        return res;
    }
    public static void main(String[] args) {
          int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
