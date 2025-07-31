public class Recursion1 {
    public int count8(int n) {
        if (n == 0) return 0;
        int last = n % 10;
        int secondLast = (n / 10) % 10;
        if (last == 8) {
            if (secondLast == 8) {
                return 2 + count8(n / 10);
            }
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }
}
