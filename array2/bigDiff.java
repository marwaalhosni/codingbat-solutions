public int bigDiff(int[] nums) {
    int min = nums[0];
    int max = nums[0];
    for (int n : nums) {
        min = Math.min(min, n);
        max = Math.max(max, n);
    }
    return max - min;
}
