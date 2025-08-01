import java.util.List;
import java.util.ArrayList;

public class Functional2Solutions {
    public List<String> noZ(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (!s.contains("z")) {
                result.add(s);
            }
        }
        return result;
    }
}
