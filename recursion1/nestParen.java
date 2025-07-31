public class NestParen {
    public static boolean nestParen(String str) {
        // Base case: empty string is valid
        if (str.length() == 0) return true;

        // If string length is 1, it can't be a valid pair
        if (str.length() == 1) return false;

        // If the first and last characters are matching parentheses
        if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            // Recur on the substring between them
            return nestParen(str.substring(1, str.length() - 1));
        }

        // Otherwise, it's not valid
        return false;
    }

    // Example tests
    public static void main(String[] args) {
        System.out.println(nestParen("(())"));     // → true
        System.out.println(nestParen("((()))"));   // → true
        System.out.println(nestParen("(((x))"));   // → false
    }
}
