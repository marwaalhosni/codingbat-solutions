public boolean sum28(int[] nums) {
    int sum = 0;
    for (int n : nums) {
        if (n == 2) sum += 2;
    }
    return sum == 8;
}
