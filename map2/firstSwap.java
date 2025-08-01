import java.util.Map;
import java.util.HashMap;

public class FirstSwap {
    public String[] firstSwap(String[] strings) {
        Map<Character, Integer> indexMap = new HashMap<>();
        boolean[] swapped = new boolean[26];

        for (int i = 0; i < strings.length; i++) {
            char firstChar = strings[i].charAt(0);
            int idx = firstChar - 'a';

            if (indexMap.containsKey(firstChar) && !swapped[idx]) {
                int prevIndex = indexMap.get(firstChar);

                // Swap the two strings
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;

                swapped[idx] = true; // disable future swaps for this char
                indexMap.remove(firstChar);
            } else if (!indexMap.containsKey(firstChar)) {
                indexMap.put(firstChar, i);
            }
        }

        return strings;
    }
}
