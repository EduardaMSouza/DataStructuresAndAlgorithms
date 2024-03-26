import java.util.*;


public class Main {

    // WRITE GROUPANAGRAMS METHOD HERE // 
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////


    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"e", "a", "t"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        Hashtable<String, ArrayList<String>> hashtable = new Hashtable<>();
        List<List<String>> finalList = new ArrayList<>();
        for (String string: strings) {
            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if (!hashtable.containsKey(sortedString)) {
                hashtable.put(sortedString, new ArrayList<>());
            }
            hashtable.get(sortedString).add(string);
        }
        hashtable.forEach((key, stringArray) -> {
            finalList.add(stringArray);
        });
        return finalList;
    }

}
