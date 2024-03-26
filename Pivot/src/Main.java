import java.util.Arrays;


public class Main {

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static void main(String[] args) {

        int[] myArray = {4,6,1,7,3,2,5};

        int returnedIndex = pivot(myArray, 0, 6);

        System.out.println( "Returned Index: " + returnedIndex);

        System.out.println( Arrays.toString( myArray ) );

        /*
            EXPECTED OUTPUT:
            ----------------
            Returned Index: 3
            [2, 1, 3, 4, 6, 7, 5]

         */

    }

    public static int pivot(int[] myArray, int pivotIndex, int endIndex) {

        int swap = pivotIndex;
        for (int y = pivotIndex+1;y <= endIndex;y++) {
            if (myArray[y] < myArray[pivotIndex]) {
                swap++;
                swap(myArray, y, swap);
            }
        }
        swap(myArray, swap, pivotIndex);
        return swap;
    }

}