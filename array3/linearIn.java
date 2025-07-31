public class LinearIn {
    public boolean linearIn(int[] outer, int[] inner) {
        int i = 0, j = 0;
        while (i < outer.length && j < inner.length) {
            if (outer[i] < inner[j]) i++;
            else if (outer[i] == inner[j]) {
                i++;
                j++;
            } else return false;
        }
        return j == inner.length;
    }
}
