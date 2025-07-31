public class StringClean {
    public static String stringClean(String str) {
        // Base case: if the string has 0 or 1 character, return it as-is
        if (str.length() <= 1) return str;

        // If the first two characters are the same, skip the first one
        if (str.charAt(0) == str.charAt(1)) {
            return stringClean(str.substring(1));
        } else {
            // Otherwise, keep the first character and recurse on the rest
            return str.charAt(0) + stringClean(str.substring(1));
        }
    }

    // You can test the method with:
    public static void main(String[] args) {
        System.out.println(stringClean("yyzzza"));    // → "yza"
        System.out.println(stringClean("abbbcdd"));   // → "abcd"
        System.out.println(stringClean("Hello"));     // → "Helo"
    }
}
