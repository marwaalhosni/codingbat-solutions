import java.util.Map;
import java.util.HashMap;

public class word0 {
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : strings) {
            result.put(str, 0);
        }
        return result;
    }
}
