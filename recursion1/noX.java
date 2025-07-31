public class Recursion1 {
    public String noX(String str) {
        if (str.isEmpty()) return "";
        char first = str.charAt(0);
        if (first == 'x') {
            return noX(str.substring(1));
        }
        return first + noX(str.substring(1));
    }
}
