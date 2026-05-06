class Solution {
    public String minWindow(String s, String t) {
        int[] count = new int[128];

        for (char c : t.toCharArray()) {
            count[c]++;
        }

        int required = t.length();

        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char r = s.charAt(right);

            if (count[r] > 0) {
                required--;
            }
            count[r]--;

            while (required == 0) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char l = s.charAt(left);

                count[l]++;

                if (count[l] > 0) {
                    required++;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}