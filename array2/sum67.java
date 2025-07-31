public int sum67(int[] nums) {
    int sum = 0;
    boolean inSection = false;
    for (int n : nums) {
        if (n == 6) inSection = true;
        if (!inSection) sum += n;
        if (inSection && n == 7) inSection = false;
    }
    return sum;
}
