public class CopyEvens {
    public int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[index++] = num;
                if (index == count) break;
            }
        }
        return result;
    }
}