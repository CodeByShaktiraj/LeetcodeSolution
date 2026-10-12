class Solution {
    public int countGoodSubstrings(String s) {

        int count = 0;

        // Check every substring of length 3
        for (int i = 0; i < s.length() - 2; i++) {

            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);

            // Check if all three characters are different
            if (a != b && b != c && a != c) {
                count++;
            }
        }

        return count;
    }
}