public class SameEnds {
    public static String sameEnds(String str) {
        int max = str.length() / 2;
        for (int i = max; i > 0; i--) {
            String start = str.substring(0, i);
            String end = str.substring(str.length() - i);
            if (start.equals(end)) {
                return start;
            }
        }
        return "";
    }
}