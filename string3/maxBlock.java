public int maxBlock(String str) {
    if (str.length() == 0) return 0;
    int max = 1, count = 1;
    for (int i = 1; i < str.length(); i++) {
        if (str.charAt(i) == str.charAt(i - 1)) {
            count++;
            if (count > max) max = count;
        } else {
            count = 1;
        }
    }
    return max;
}
