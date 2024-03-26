import java.util.Arrays;


public class Main {

    public static void bubbleSort(int[] myArray) {
        for (int i = myArray.length-1;i >= 0;i--) {
            for (int y = 0;y < i;y++) {
                if (myArray[y] > myArray[y+1]) {
                    int temp = myArray[y];
                    myArray[y] = myArray[y+1];
                    myArray[y+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        insertionSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }

    public static void insertionSort(int[] myArray) {
        for (int i = 1; i < myArray.length;i++) {
            int temp = myArray[i];
            int y = i-1;
            while (y >= 0 && myArray[y] > temp) {
                myArray[y+1] = myArray[y];
                myArray[y] = temp;
                y--;
            }
        }
    }

    public static void selectionSort(int[] myArray) {
        for (int i = 0;i < myArray.length;i++) {
            int minIndex = i;
            for (int y = i; y < myArray.length;y++) {
                if (myArray[minIndex] > myArray[y]){
                    minIndex = y;
                }
            }
            if (i != minIndex) {
                int temp = myArray[i];
                myArray[i] = myArray[minIndex];
                myArray[minIndex] = temp;
            }
            }
    }


}