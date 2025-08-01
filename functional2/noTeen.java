import java.util.List;
import java.util.ArrayList;

public class Functional2Solutions {
    public List<Integer> noTeen(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (num < 13 || num > 19) {
                result.add(num);
            }
        }
        return result;
    }
}
