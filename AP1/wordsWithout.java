public class WordsWithout {
    public String[] wordsWithout(String[] words, String target) {
        int count = 0;
        for (String word : words) {
            if (!word.equals(target)) count++;
        }
        String[] result = new String[count];
        int index = 0;
        for (String word : words) {
            if (!word.equals(target)) {
                result[index++] = word;
            }
        }
        return result;
    }
}
