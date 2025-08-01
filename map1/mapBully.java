import java.util.Map;

public class mapBully {
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            String aVal = map.get("a");
            map.put("b", aVal);
            map.put("a", "");
        }
        return map;
    }
}