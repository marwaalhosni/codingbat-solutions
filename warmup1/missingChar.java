public String missingChar(String str, int n) {
    // Take the substring before index n
    String before = str.substring(0, n);
    // Take the substring after index n
    String after = str.substring(n + 1);
    // Combine and return
    return before + after;
}