class Solution {
    public int divisorSubstrings(int num, int k) {

        String s = String.valueOf(num);
        int count = 0;

        // Loop through all substrings of length k
        for (int i = 0; i <= s.length() - k; i++) {

            // Get substring of length k
            String sub = s.substring(i, i + k);

            // Convert substring to integer
            int value = Integer.parseInt(sub);

            // Check if value is a divisor of num
            if (value != 0 && num % value == 0) {
                count++;
            }
        }

        return count;
    }
}