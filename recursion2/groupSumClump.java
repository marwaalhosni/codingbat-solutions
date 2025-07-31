public class Recursion2 {
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        int i = start + 1;
        while (i < nums.length && nums[i] == nums[start]) {
            i++;
        }
        int sum = 0;
        for (int j = start; j < i; j++) {
            sum += nums[j];
        }
        if (groupSumClump(i, nums, target - sum)) return true;
        return groupSumClump(i, nums, target);
    }
}
