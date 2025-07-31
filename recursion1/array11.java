public class Recursion1 {
    public int array11(int[] nums, int index) {
        if (index >= nums.length) return 0;
        int count = (nums[index] == 11) ? 1 : 0;
        return count + array11(nums, index + 1);
    }
}
