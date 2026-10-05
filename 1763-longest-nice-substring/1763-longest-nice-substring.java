class Solution {
    public String longestNiceSubstring(String s) {

        // If length is less than 2,
        // it cannot be a nice string
        if (s.length() < 2) {
            return "";
        }

        // Check every character
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Check whether both uppercase and lowercase exist
            if (s.indexOf(Character.toLowerCase(ch)) == -1 ||
                s.indexOf(Character.toUpperCase(ch)) == -1) {

                // This character cannot be part of a nice substring

                // Solve the left part
                String left = longestNiceSubstring(s.substring(0, i));

                // Solve the right part
                String right = longestNiceSubstring(s.substring(i + 1));

                // Return the longer one
                if (left.length() >= right.length()) {
                    return left;
                } else {
                    return right;
                }
            }
        }

        // If every character has both cases,
        // the whole string is nice
        return s;
    }
}