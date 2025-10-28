public class MaximumSubarraySum {
    //Kadane's Algorithms

    public static int maximumSubarraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }

 
     return maxSum;

    }

    public static void main(String[] args) {
        int arr[] = {3,-4,5,4,-1,7,-8 };
        int maxsum = maximumSubarraySum(arr);
        System.out.println(maxsum);
    }
}