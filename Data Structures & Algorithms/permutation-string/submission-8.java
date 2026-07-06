class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1_counts = new int[26];
        int[] s2_counts = new int[26];
        int n = s1.length();

        for (int i = 0; i < n; i++) {
            s1_counts[s1.charAt(i) - 'a']++;
            s2_counts[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length() - n; i++) {
            if (Arrays.equals(s1_counts, s2_counts)){
                return true;
            }

            s2_counts[s2.charAt(i) - 'a']--;
            s2_counts[s2.charAt(i + n) - 'a']++;
        }

        return Arrays.equals(s1_counts, s2_counts);
    }
}