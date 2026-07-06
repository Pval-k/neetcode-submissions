class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> targetFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }

        int i = 0, j = 0;
        int chars_found = 0;
        int minLen = Integer.MAX_VALUE;
        String result = "";

        while (j < s.length()) {
            char rightChar = s.charAt(j);
            
            // If the char is in our target, update the map
            if (targetFreq.containsKey(rightChar)) {
                if (targetFreq.get(rightChar) > 0) chars_found++;
                targetFreq.put(rightChar, targetFreq.get(rightChar) - 1);
            }
            j++;

            // Shrink the window: Contract phase
            while (chars_found == t.length()) {
                if (j - i < minLen) {
                    minLen = j - i;
                    result = s.substring(i, j);
                }

                char leftChar = s.charAt(i);
                if (targetFreq.containsKey(leftChar)) {
                    targetFreq.put(leftChar, targetFreq.get(leftChar) + 1);
                    // If frequency becomes > 0, we are no longer "valid"
                    if (targetFreq.get(leftChar) > 0) chars_found--;
                }
                i++;
            }
        }
        return result;
    }
}