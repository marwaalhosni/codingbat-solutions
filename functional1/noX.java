import java.util.*;
import java.util.stream.Collectors;

public class NoX {
    public static List<String> noX(List<String> strings) {
        return strings.stream()
                .map(s -> s.replace("x", ""))
                .collect(Collectors.toList());
    }
}
