import java.util.*;


public class Main {

    // WRITE THE TWOSUM MEHTOD HERE //
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////


    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []

        */

    }

    private static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] arrayList = new int[2];
        for (int i = 0;i < numbers.length;i++) {
            hashMap.put(numbers[i], i);
        }
        for (int i = 0;i < numbers.length;i++) {
            int temp = target-numbers[i];

            if (hashMap.get(temp) != null && hashMap.get(temp) != i) {
                arrayList[0] = i;
                arrayList[1] = hashMap.get(temp);
                return arrayList;
            }
        }
        return new int[]{};
    }

}
