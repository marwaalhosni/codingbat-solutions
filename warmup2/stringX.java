public class StringX {
    public String stringX(String str) {
        if (str.length() <= 2) return str;
        String middle = str.substring(1, str.length() - 1).replace("x", "");
        return str.charAt(0) + middle + str.charAt(str.length() - 1);
    }
}