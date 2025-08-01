import java.util.Map;

public class Topping1 {
    public Map<String, String> topping1(Map<String, String> map) {
        // Always set bread to butter
        map.put("bread", "butter");

        // If "ice cream" exists, change its value to "cherry"
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }

        return map;
    }
}