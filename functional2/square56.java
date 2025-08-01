import java.util.List;
import java.util.ArrayList;

public class Functional2Solutions {
    public List<Integer> square56(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int n : nums) {
            int val = n * n + 10;
            int lastDigit = val % 10;
            if (lastDigit != 5 && lastDigit != 6) {
                result.add(val);
            }
        }
        return result;
    }
}
