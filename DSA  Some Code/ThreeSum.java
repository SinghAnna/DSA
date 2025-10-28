import java.util.*;

public class ThreeSum {
    static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<ArrayList<Integer>> uniqueList = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            int target = -nums[i];
            Set<Integer> unique = new HashSet<>();
            
            for (int j = i + 1; j < n; j++) {
                int third = target - nums[j];
                
                if (unique.contains(third)) {
                    ArrayList<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[j], third));
                    Collections.sort(triplet);
                    uniqueList.add(triplet);
                }
                unique.add(nums[j]);
            }
        }

        return new ArrayList<>(uniqueList);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
