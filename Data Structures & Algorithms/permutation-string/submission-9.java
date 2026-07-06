class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1_counts = new int[26];
        int[] s2_counts = new int[26];

        for (int j = 0; j < s1.length(); j++) {
            s1_counts[s1.charAt(j) - 'a']++;
            s2_counts[s2.charAt(j) - 'a']++;
        }

        int i = 0;
        int j = s1.length();

        while (j < s2.length()) {
            if (Arrays.equals(s1_counts, s2_counts)) {
                return true;
            }

            s2_counts[s2.charAt(i) - 'a']--;
            i++;

            s2_counts[s2.charAt(j) - 'a']++;
            j++;
        }

        return Arrays.equals(s1_counts, s2_counts);
    }
}