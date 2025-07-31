public class ScoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        return largestSpecial(a) + largestSpecial(b);
    }

    public int largestSpecial(int[] scores) {
        int max = 0;
        for (int score : scores) {
            if (score % 10 == 0 && score > max) {
                max = score;
            }
        }
        return max;
    }
}
