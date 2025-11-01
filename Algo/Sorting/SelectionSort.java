public class SelectionSort {

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n -1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {14,151,95,47,25,63,48,57,96,1,0,47,39};

        System.out.print("array before Selection Sort : ");
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println();

        selectionSort(arr);
        System.out.print("array after Selection Sort : ");
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }

}
