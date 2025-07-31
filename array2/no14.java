public boolean no14(int[] nums) {
    boolean has1 = false;
    boolean has4 = false;
    for (int n : nums) {
        if (n == 1) has1 = true;
        if (n == 4) has4 = true;
    }
    return !(has1 && has4);
}
