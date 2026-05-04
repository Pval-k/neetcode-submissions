public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // build frequency for s1 and first window of s2
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        // check first window
        if (Arrays.equals(s1Count, windowCount)) {
            return true;
        }

        int l = 0;

        // slide window
        for (int r = s1.length(); r < s2.length(); r++) {
            // add right char
            windowCount[s2.charAt(r) - 'a']++;

            // remove left char
            windowCount[s2.charAt(l) - 'a']--;
            l++;

            if (Arrays.equals(s1Count, windowCount)) {
                return true;
            }
        }

        return false;
    }
}