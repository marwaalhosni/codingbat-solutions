public class MinCat {
    public String minCat(String a, String b) {
        int minLen = Math.min(a.length(), b.length());
        return a.substring(a.length() - minLen) + b.substring(b.length() - minLen);
    }
}
