import java.util.*;


public class Main {

    // WRITE FIRSTNONREPEATINGCHAR METHOD HERE //
    //                                         //
    //                                         //
    //                                         //
    //                                         //
    /////////////////////////////////////////////


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
        
        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

    }

    public static Character firstNonRepeatingChar(String leetcode) {
        char[] chars = leetcode.toCharArray();
        HashMap hashMap = new HashMap();
        for (char i : chars) {
            if (hashMap.get(i) != null) {
                hashMap.put(i, null);
            }else {
                hashMap.put(i, true);

            }
        }
        for (char i : chars) {
            if (hashMap.get(i) != null) return i;
        }
        return null;
    }

}
