class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count = new int[26];

        // Step 1: build frequency for s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;

        // Step 2: expand window
        for (int right = 0; right < s2.length(); right++) {
            char r = s2.charAt(right);
            count[r - 'a']--;

            // Step 3: if invalid (too many of a char), shrink window
            while (count[r - 'a'] < 0) {
                char l = s2.charAt(left);
                count[l - 'a']++;
                left++;
            }

            // Step 4: check window size
            if (right - left + 1 == s1.length()) {
                return true;
            }
        }

        return false;
    }
}