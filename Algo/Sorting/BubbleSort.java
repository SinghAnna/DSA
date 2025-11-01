public class BubbleSort{

    //Bubble Sort Algorithm Implementation time complexity O(n^2) in worst and average case and O(n) in best case
    //space complexity O(1) 
  public static void bubbleSort(int[] arr){
        int n = arr.length;

        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            if (!swapped) {
                break;
            }
            
        }
    }

    public static void main(String[] args) {

         int[] arr = {4,741,8,289,417,58,62,47,74,95,41};

         System.out.print("array before Bubble Sort : ");
         for (int i : arr) {
            System.out.print(" " + i);
         }

         bubbleSort(arr);
         System.out.println();

         System.out.print("array after Bubble Sort : ");
         for (int i : arr) {
            System.out.print(" " + i);
         }
        
    } 

}