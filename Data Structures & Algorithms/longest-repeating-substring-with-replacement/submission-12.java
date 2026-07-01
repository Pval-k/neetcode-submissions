class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> counts = new HashMap<>();
        int i = 0;
        int j = 0;
        int maxRepeatCount = 0;
        int maxLength = 0;

        while (j < s.length()) {
            char rightChar = s.charAt(j);
            counts.put(rightChar, counts.getOrDefault(rightChar, 0) + 1);
            maxRepeatCount = Math.max(maxRepeatCount, counts.get(rightChar));

            while ((j - i + 1) - maxRepeatCount > k) {
                char leftChar = s.charAt(i);
                counts.put(leftChar, counts.get(leftChar) - 1);
                i++;
            }

            maxLength = Math.max(maxLength, j - i + 1);
            j++;
        }

        return maxLength;
    }
}