import java.util.Map;
import java.util.HashMap;

public class FirstChar {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> result = new HashMap<>();

        for (String s : strings) {
            String key = s.substring(0, 1);
            String val = result.getOrDefault(key, "");
            result.put(key, val + s);
        }

        return result;
    }
}
