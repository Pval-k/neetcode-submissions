class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> counts = new HashMap<>();
        int left = 0;
        int maxRepeatCount = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            counts.put(rightChar, counts.getOrDefault(rightChar, 0) + 1);
            maxRepeatCount = Math.max(maxRepeatCount, counts.get(rightChar));

            while ((right - left + 1) - maxRepeatCount > k) {
                char leftChar = s.charAt(left);
                counts.put(leftChar, counts.get(leftChar) - 1);
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}