import java.util.Arrays;

class Solution {
    public int[] numMovesStonesII(int[] stones) {

        Arrays.sort(stones);

        int n = stones.length;

        // Maximum moves
        int maxMoves = Math.max(
            stones[n - 2] - stones[0],
            stones[n - 1] - stones[1]
        ) - (n - 2);

        // Minimum moves
        int minMoves = n;

        int left = 0;

        for (int right = 0; right < n; right++) {

            // Keep at most n consecutive positions
            while (stones[right] - stones[left] + 1 > n) {
                left++;
            }

            int count = right - left + 1;

            // Special case
            if (count == n - 1 &&
                stones[right] - stones[left] + 1 == n - 1) {

                minMoves = Math.min(minMoves, 2);

            } else {
                minMoves = Math.min(minMoves, n - count);
            }
        }

        return new int[]{minMoves, maxMoves};
    }
}