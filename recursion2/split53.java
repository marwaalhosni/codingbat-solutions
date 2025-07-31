public class Recursion2 {
    public boolean split53(int[] nums) {
        return helper(nums, 0, 0, 0);
    }

    private boolean helper(int[] nums, int index, int sum1, int sum2) {
        if (index == nums.length) {
            return sum1 == sum2;
        }
        if (nums[index] % 5 == 0) {
            return helper(nums, index + 1, sum1 + nums[index], sum2);
        }
        if (nums[index] % 3 == 0) {
            return helper(nums, index + 1, sum1, sum2 + nums[index]);
        }
        return helper(nums, index + 1, sum1 + nums[index], sum2) || helper(nums, index + 1, sum1, sum2 + nums[index]);
    }
}