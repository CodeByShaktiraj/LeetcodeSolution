import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {

        // Sort the array
        Arrays.sort(nums);

        // Store the minimum difference
        int min = Integer.MAX_VALUE;

        // Check every group of k consecutive elements
        for (int i = 0; i <= nums.length - k; i++) {

            // Highest - Lowest
            int difference = nums[i + k - 1] - nums[i];

            // Update minimum
            min = Math.min(min, difference);
        }

        return min;
    }
}