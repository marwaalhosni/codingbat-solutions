public class SquareUp {
    public int[] squareUp(int n) {
        int[] result = new int[n * n];
        for (int i = 1; i <= n; i++) {
            int start = n * i - 1;
            for (int j = 0; j < i; j++) {
                result[start - j] = j + 1;
            }
        }
        return result;
    }
}
