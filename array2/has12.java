public boolean has12(int[] nums) {
    boolean found1 = false;
    for (int num : nums) {
        if (num == 1) {
            found1 = true;
        } else if (found1 && num == 2) {
            return true;
        }
    }
    return false;
}
