public int[] post4(int[] nums) {
    int last4 = -1;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 4) last4 = i;
    }
    int[] result = new int[nums.length - last4 - 1];
    for (int i = last4 + 1; i < nums.length; i++) {
        result[i - last4 - 1] = nums[i];
    }
    return result;
}
