public boolean only14(int[] nums) {
    for (int n : nums) {
        if (n != 1 && n != 4) return false;
    }
    return true;
}
