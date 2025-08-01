import java.util.Map;
import java.util.HashMap;

public class Pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String word : strings) {
            String firstChar = word.substring(0, 1);
            String lastChar = word.substring(word.length() - 1);
            map.put(firstChar, lastChar);
        }

        return map;
    }
}
