public class Main {

    public static String reverseString(String string) {
        String reverseString = "";
        for (int i = string.length(); i > 0; i--) {
            reverseString = reverseString.concat(string.substring(i-1, i));
        }
        return reverseString;
    }



    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }

}
