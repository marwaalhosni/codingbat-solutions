public String notReplace(String str) {
    StringBuilder result = new StringBuilder();
    int i = 0;
    while (i < str.length()) {
        if (i + 1 < str.length() && str.charAt(i) == 'i' && str.charAt(i+1) == 's' &&
                (i == 0 || !Character.isLetter(str.charAt(i-1))) &&
                (i + 2 == str.length() || !Character.isLetter(str.charAt(i+2)))) {
            result.append("is not");
            i += 2;
        } else {
            result.append(str.charAt(i));
            i++;
        }
    }
    return result.toString();
}
