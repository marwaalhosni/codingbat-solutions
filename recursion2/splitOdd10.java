public class Recursion2 {
    public boolean splitOdd10(int[] nums) {
        return helper(nums, 0, 0, 0);
    }

    private boolean helper(int[] nums, int index, int sum1, int sum2) {
        if (index == nums.length) {
            return (sum1 % 10 == 0 && sum2 % 2 == 1) || (sum2 % 10 == 0 && sum1 % 2 == 1);
        }
        return helper(nums, index + 1, sum1 + nums[index], sum2) || helper(nums, index + 1, sum1, sum2 + nums[index]);
    }
}
