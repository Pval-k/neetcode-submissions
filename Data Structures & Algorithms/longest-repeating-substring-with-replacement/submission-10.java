class Solution {
    public int characterReplacement(String s, int k) {
        // 1. Initialize state tracking (HashMap)
        HashMap<Character, Integer> counts = new HashMap<>();
        int left = 0;
        int maxRepeatCount = 0;
        int maxLength = 0;

        // 2. Expand the window using the 'right' pointer
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            
            // 3. Add the incoming character to your map state
            counts.put(rightChar, counts.getOrDefault(rightChar, 0) + 1);
            
            // Update the highest frequency seen in the current window
            maxRepeatCount = Math.max(maxRepeatCount, counts.get(rightChar));

            // 4. Invalid condition: If remaining replacements needed > k, shrink!
            while ((right - left + 1) - maxRepeatCount > k) {
                char leftChar = s.charAt(left);
                
                // Decrement the count of the character leaving the window
                counts.put(leftChar, counts.get(leftChar) - 1);
                
                left++; // Shrink
            }

            // 5. Update global maximum
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}