public class SumNumbers {
    public static int sumNumbers(String str) {
        int sum = 0;
        StringBuilder num = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                num.append(ch);
            } else {
                if (num.length() > 0) {
                    sum += Integer.parseInt(num.toString());
                    num.setLength(0);
                }
            }
        }
        if (num.length() > 0) {
            sum += Integer.parseInt(num.toString());
        }
        return sum;
    }
}
