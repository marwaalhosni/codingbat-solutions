public boolean sameEnds(int[] nums, int n) {
    for (int i = 0; i < n; i++) {
        if (nums[i] != nums[nums.length - n + i]) {
            return false;
        }
    }
    return true;
}
