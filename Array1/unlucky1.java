public class Unlucky1 {
    public boolean unlucky1(int[] nums) {
        int len = nums.length;
        if (len < 2) return false;

        return (nums[0] == 1 && nums[1] == 3) ||
                (len > 2 && nums[1] == 1 && nums[2] == 3) ||
                (nums[len - 2] == 1 && nums[len - 1] == 3);
    }
}
