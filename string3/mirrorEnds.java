public String mirrorEnds(String string) {
    int i = 0;
    while (i < string.length() && string.charAt(i) == string.charAt(string.length() - 1 - i)) {
        i++;
    }
    return string.substring(0, i);
}
