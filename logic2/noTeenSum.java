public class noTeenSum {
    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        if ((n >= 13 && n <= 19) && n != 15 && n != 16) {
            return 0;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(noTeenSum(1, 2, 3));   // 6
        System.out.println(noTeenSum(2, 13, 1));  // 3
        System.out.println(noTeenSum(2, 1, 14));  // 3
    }
}