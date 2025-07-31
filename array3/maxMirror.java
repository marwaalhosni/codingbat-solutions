public class MaxMirror {
    public int maxMirror(int[] nums) {
        int max = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                int length = 0;
                while (i + length < n && j - length >= 0 && nums[i + length] == nums[j - length]) {
                    length++;
                }
                if (length > max) max = length;
            }
        }
        return max;
    }
}
