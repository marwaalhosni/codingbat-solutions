public class ScoreUp {
    public int scoreUp(String[] key, String[] answers) {
        int score = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals("?")) continue;
            if (answers[i].equals(key[i])) score += 4;
            else score -= 1;
        }
        return score;
    }
}
