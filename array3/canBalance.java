public class CanBalance {
    public boolean canBalance(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            if (leftSum * 2 == total) return true;
        }
        return false;
    }
}
