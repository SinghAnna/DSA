import java.util.HashSet;

public class TwoSum {

    public static int[] pairSum(int[] arr, int target) {
        int[] pairSumValue = new int[2];

        HashSet<Integer> val = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int remain = arr[i] - target;
            if (val.contains(remain)) {
                pairSumValue[0] = remain;
                pairSumValue[1] = arr[i];
                return pairSumValue;
            }
            val.add(arr[i]);

        }

        return pairSumValue;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };

        int[] val = pairSum(arr, 9);

        for (int iterable_element : val) {
            System.out.print(iterable_element + " ");
        }
    }
}
