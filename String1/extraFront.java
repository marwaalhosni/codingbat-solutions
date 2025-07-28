public class ExtraFront {
    public String extraFront(String str) {
        String front = str.length() >= 2 ? str.substring(0, 2) : str;
        return front + front + front;
    }
}
