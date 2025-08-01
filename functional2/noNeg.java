import java.util.List;
import java.util.ArrayList;

public class Functional2Solutions {
    public List<Integer> noNeg(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (num >= 0) {
                result.add(num);
            }
        }
        return result;
    }
}
