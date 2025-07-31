public int[] withoutTen(int[] nums) {
    int index = 0;
    for (int num : nums) {
        if (num != 10) {
            nums[index++] = num;
        }
    }
    while (index < nums.length) {
        nums[index++] = 0;
    }
    return nums;
}
