class Solution {
    public double findMaxAverage(int[] nums, int k) {

        // Calculate sum of the first k elements
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Store the maximum sum
        int maxSum = sum;

        // Start the sliding window
        for (int right = k; right < nums.length; right++) {

            // Add the new element
            sum += nums[right];

            // Remove the element that left the window
            sum -= nums[right - k];

            // Update maximum sum
            maxSum = Math.max(maxSum, sum);
        }

        // Convert maximum sum to average
        return (double) maxSum / k;
    }
}