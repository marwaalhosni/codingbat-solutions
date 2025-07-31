public int centeredAverage(int[] nums) {
    int sum = 0;
    int min = nums[0];
    int max = nums[0];

    for (int num : nums) {
        sum += num;
        if (num < min) min = num;
        if (num > max) max = num;
    }

    return (sum - min - max) / (nums.length - 2);
}
