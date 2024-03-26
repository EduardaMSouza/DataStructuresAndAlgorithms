import java.util.*;


public class Main {

    // WRITE THE REMOVEDUPLICATES METHOD HERE //
    //                                        //
    //                                        //
    //                                        //
    ////////////////////////////////////////////


    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4, 1, 2, 5, 6, 7, 3, 4, 8, 9, 5);
        List<Integer> newList = removeDuplicates(myList);
        System.out.println(newList);

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6, 7, 8, 9]

            (Order may be different as sets are unordered)
        */

    }

    public static List<Integer> removeDuplicates(List<Integer> myList) {
        Set<Integer> set = new HashSet<>();
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (int i : myList) {
            set.add(i);
        }
        for (int i: set) {
            uniqueNumbers.add(i);
        }
        return uniqueNumbers;
    }

}
