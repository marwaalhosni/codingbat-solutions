public class FrontTimes {
    public String frontTimes(String str, int n) {
        String front = str.length() < 3 ? str : str.substring(0, 3);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }
}
