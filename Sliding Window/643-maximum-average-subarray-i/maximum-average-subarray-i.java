class Solution {
    public double findMaxAverage(int[] nums, int k) {

        double curr = 0;

        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        double max = curr / k;

        for (int i = 1; i <= nums.length - k; i++) {
            curr = curr - nums[i - 1] + nums[i + k - 1];
            max = Math.max(max, curr / k);
        }

        return max;
    }
}
