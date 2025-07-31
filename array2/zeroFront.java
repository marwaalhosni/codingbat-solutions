public int[] zeroFront(int[] nums) {
    int[] result = new int[nums.length];
    int zeroIndex = 0;
    int nonZeroIndex = nums.length - 1;

    for (int num : nums) {
        if (num == 0) {
            result[zeroIndex++] = 0;
        } else {
            result[nonZeroIndex--] = num;
        }
    }
    for (int i = zeroIndex; i <= nonZeroIndex; i++) {
        result[i] = result[nonZeroIndex + 1];
    }
    return result;
}
