import java.util.List;
import java.util.ArrayList;

public class Functional2Solutions {
    public List<Integer> no9(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer num : nums) {
            if (num % 10 != 9) {
                result.add(num);
            }
        }
        return result;
    }
}
