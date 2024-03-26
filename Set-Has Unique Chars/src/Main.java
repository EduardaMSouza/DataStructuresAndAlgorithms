import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {

    // WRITE HASUNIQUECHARS METHOD HERE //
    //                                  //
    //                                  //
    //                                  //
    //                                  //
    //////////////////////////////////////


    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false
            
        */

    }

    public static boolean hasUniqueChars(String abcdefg) {
        Set<Character> set = new HashSet<>();
        char[] listChars = abcdefg.toCharArray();
        for (char chars: listChars) {
            set.add(chars);
        }
        if (set.size() != listChars.length) return false;
        return true;
    }

}
