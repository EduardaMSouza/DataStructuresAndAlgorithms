import java.util.*;


public class Main {

    // WRITE FINDPAIRS METHOD HERE // 
    //                             //
    //                             // 
    //                             //
    //                             //
    /////////////////////////////////


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]
            
        */

    }

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> set = new HashSet();
        List<int[]> sumNumbers = new ArrayList<>();
        for (int i: arr1) {
            set.add(i);
        }
        for (int i: set) {
            for (int y: arr2) {
                if (i + y == target) {
                    sumNumbers.add(new int[]{i, y});
                }
            }
        }
        return sumNumbers;
    }

}

    