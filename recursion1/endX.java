public class Recursion1 {
    public String endX(String str) {
        if (str.isEmpty()) return "";
        char first = str.charAt(0);
        if (first == 'x') {
            return endX(str.substring(1)) + "x";
        }
        return first + endX(str.substring(1));
    }
}
