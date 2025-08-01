import java.util.List;
import java.util.ArrayList;

public class Functional2Solutions {
    public List<String> noLong(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (str.length() < 4) {
                result.add(str);
            }
        }
        return result;
    }
}
