public class WithoutX {
    public String withoutX(String str) {
        if (str.length() == 0) return str;
        int start = 0, end = str.length();
        if (str.startsWith("x")) start = 1;
        if (str.endsWith("x")) end -= 1;
        return str.substring(start, end);
    }
}
