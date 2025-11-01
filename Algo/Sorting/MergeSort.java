public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right){
        if (left < right) {
            int mid = left + (right - left) / 2;
            // Sort First and Second Half
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);

            // merge the Sorted have
            merge(arr, left,mid,right);
        }
    }

    public static void merge(int[] arr, int left, int mid , int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) 
        {
            L[i] = arr[left+i];    
        }

        for (int j = 0; j < n2; ++j) {
            R[j] = arr[mid + 1 +j];
        }

        int i = 0 , j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }
        }

        // copy remaing element
        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static void main(String[] args) {

        int[] arr = { 14, 151, 95, 47, 25, 63, 48, 57, 96, 1, 0, 47, 39 };

        System.out.print("array before Merge Sort : ");
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("array after Merge Sort : ");
        for (int i : arr) {
            System.out.print(" " + i);
        }
        
    }
}
