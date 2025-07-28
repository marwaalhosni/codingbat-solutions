public class MaxTriple {
    public int maxTriple(int[] nums) {
        int mid = nums.length / 2;
        return Math.max(nums[mid], Math.max(nums[0], nums[nums.length - 1]));
    }
}
