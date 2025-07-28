public String last2(String str) {
    int len = str.length();
    if (len < 2) return 0;

    String end = str.substring(len - 2);
    int count = 0;

    for (int i = 0; i < len - 2; i++) {
        if (str.substring(i, i + 2).equals(end)) {
            count++;
        }
    }

    return count;
}
