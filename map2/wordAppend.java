import java.util.Map;
import java.util.HashMap;

public class WordAppend {
    public String wordAppend(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (String str : strings) {
            int count = countMap.getOrDefault(str, 0) + 1;
            countMap.put(str, count);

            if (count % 2 == 0) {
                result.append(str);
            }
        }

        return result.toString();
    }
}
