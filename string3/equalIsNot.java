public boolean equalIsNot(String str) {
    int countIs = 0, countNot = 0;
    for (int i = 0; i <= str.length() - 2; i++) {
        if (str.substring(i, i + 2).equals("is")) countIs++;
    }
    for (int i = 0; i <= str.length() - 3; i++) {
        if (str.substring(i, i + 3).equals("not")) countNot++;
    }
    return countIs == countNot;
}
