import java.util.*;
import java.util.stream.Collectors;

public class Doubling {
    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }
}
