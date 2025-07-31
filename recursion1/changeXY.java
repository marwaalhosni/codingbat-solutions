public String changeXY(String str) {
    if (str.isEmpty()) return "";
    char first = str.charAt(0) == 'x' ? 'y' : str.charAt(0);
    return first + changeXY(str.substring(1));
}
