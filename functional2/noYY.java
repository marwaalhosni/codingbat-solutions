import java.util.List;
import java.util.ArrayList;

public class Functional2Solutions {
    public List<String> noYY(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            String modified = s + "y";
            if (!modified.contains("yy")) {
                result.add(modified);
            }
        }
        return result;
    }
}
