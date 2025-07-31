public class CommonTwo {
    public int commonTwo(String[] a, String[] b) {
        int i = 0, j = 0, count = 0;
        String lastCounted = "";
        while (i < a.length && j < b.length) {
            if (a[i].equals(b[j])) {
                if (!a[i].equals(lastCounted)) {
                    count++;
                    lastCounted = a[i];
                }
                i++;
                j++;
            } else if (a[i].compareTo(b[j]) < 0) {
                i++;
            } else {
                j++;
            }
        }
        return count;
    }
}
