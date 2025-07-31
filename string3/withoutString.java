public String withoutString(String base, String remove) {
    String baseLower = base.toLowerCase();
    String removeLower = remove.toLowerCase();
    StringBuilder result = new StringBuilder();

    int i = 0;
    while (i < base.length()) {
        if (i <= base.length() - remove.length() &&
                baseLower.substring(i, i + remove.length()).equals(removeLower)) {
            i += remove.length();
        } else {
            result.append(base.charAt(i));
            i++;
        }
    }
    return result.toString();
}
