class Solution {
    public int lengthOfLastWord(String s) {

        // Start from the last character
        int i = s.length() - 1;

        // Step 1: Skip spaces at the end
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // This will store the length of the last word
        int count = 0;

        // Step 2: Count characters until we find a space
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        // Return the length of the last word
        return count;
    }
}