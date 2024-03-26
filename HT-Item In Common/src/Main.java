import java.util.HashMap;

public class Main {

    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap hashMap = new HashMap<>();
        for (int i : array1) {
            hashMap.put(i, true);
        }

        for (int y : array2) {
            if (hashMap.get(y) != null) return true;
        }
        return false;
    }


    public static void main(String[] args) {

        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};

        System.out.println(itemInCommon(array1, array2));

        /*
            EXPECTED OUTPUT:
            ----------------
            true

        */

    }

}