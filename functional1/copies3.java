import java.util.*;
import java.util.stream.Collectors;

public class Copies3 {
    public static List<String> copies3(List<String> strings) {
        return strings.stream()
                .map(s -> s + s + s)
                .collect(Collectors.toList());
    }
}
