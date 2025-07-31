public class StrDist {
    public static int strDist(String str, String sub) {
        // Base case: if the string is shorter than sub, no match possible
        if (str.length() < sub.length()) return 0;

        // If str starts with sub AND ends with sub, we found the full span
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length();
        }

        // If it doesn't start with sub, trim from the beginning
        if (!str.startsWith(sub)) {
            return strDist(str.substring(1), sub);
        }

        // If it doesn't end with sub, trim from the end
        return strDist(str.substring(0, str.length() - 1), sub);
    }

    // Example tests
    public static void main(String[] args) {
        System.out.println(strDist("catcowcat", "cat"));       // → 9
        System.out.println(strDist("catcowcat", "cow"));       // → 3
        System.out.println(strDist("cccatcowcatxx", "cat"));   // → 9
    }
}
