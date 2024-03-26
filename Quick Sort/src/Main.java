import java.util.Arrays;


public class Main {

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);

        return swapIndex;
    }


    private static void quickSortHelper(int[] array, int i, int i1) {
        if (i < i1) {
            int index = pivot(array, i, i1);
            quickSortHelper(array,i, index-1);
            quickSortHelper(array, index+1, i1);
        }
    }

    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length-1);
    }




    public static void main(String[] args) {

        int[] myArray = {3,7, -5, 5, 4};

        quickSort(myArray);

        System.out.println( Arrays.toString( myArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7]

         */

    }

}
