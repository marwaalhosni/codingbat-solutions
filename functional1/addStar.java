import java.util.*;
import java.util.stream.Collectors;

public class AddStar {
    public static List<String> addStar(List<String> strings) {
        return strings.stream()
                .map(s -> s + "*")
                .collect(Collectors.toList());
    }
}
