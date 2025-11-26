public class QuickSort {

    public static void quickSort(int[] arr, int low, int high){
        if (low < high) {
            int pi = partition(arr,low,high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        // swap pivot to its correct place

        int temp  = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;



        return i+1;

    }



    public static void main(String[] args) {
        int[] arr = {14,151,95,47,25,63,48,57,96,1,0,47,39};

        System.out.print("array before quick Sort : ");
        for (int i : arr) {
            System.out.print(" " + i);
        }
        System.out.println();

        quickSort(arr, 0, arr.length - 1);
        System.out.print("array after quick Sort : ");
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }
}
