public class Make2 {
    public int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int index = 0;

        for (int num : a) {
            if (index < 2) {
                result[index++] = num;
            }
        }

        for (int num : b) {
            if (index < 2) {
                result[index++] = num;
            }
        }

        return result;
    }
}
