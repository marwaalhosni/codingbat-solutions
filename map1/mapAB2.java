import java.util.Map;

public class MapAB2 {
    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String aVal = map.get("a");
            String bVal = map.get("b");
            if (aVal.equals(bVal)) {
                map.remove("a");
                map.remove("b");
            }
        }
        return map;
    }
}
