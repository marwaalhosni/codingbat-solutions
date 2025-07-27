public class endUp {
    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        String front = str.substring(0, str.length() - 3);
        String back = str.substring(str.length() - 3).toUpperCase();
        return front + back;
    }
}
