import java.util.List;
import java.util.ArrayList;

public class Functional2Solutions {
    public List<String> no34(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            int len = s.length();
            if (len != 3 && len != 4) {
                result.add(s);
            }
        }
        return result;
    }
}
