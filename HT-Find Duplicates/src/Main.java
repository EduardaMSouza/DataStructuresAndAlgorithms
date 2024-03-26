import java.util.*;


public class Main {

    // WRITE THE FINDDUPLICATES METHOD HERE // 
    //                                      //
    //                                      //
    //                                      //
    //                                      //
    //////////////////////////////////////////


    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4, 4, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates); 
        
        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }

    public static List<Integer> findDuplicates(int[] nums) {
        HashMap hashMap = new HashMap<>();
        List<Integer> repeatedNumbers = new ArrayList<>();
        for (int i: nums) {
            if (hashMap.get(i) != null && !repeatedNumbers.contains(i)) {
                repeatedNumbers.add(i);
            }else {
                hashMap.put(i, true);
            }
        }
        return repeatedNumbers;
    }

}
