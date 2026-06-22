class Solution {
    public int longestConsecutive(int[] nums) {
        //Goal: reutnr LENGTH of the longest sequence
        int longest_length = 0;
        
        //each nums will be in this hash
        HashSet<Integer> hash = new HashSet<>();

        //fill Hashset
        for(int num : nums){
            hash.add(num);
        }

        for(int num : nums){
            if(hash.contains(num-1)){
                continue;
            }
            int next_num = num+1;
            int cur_length = 1;
            while(hash.contains(next_num)){
                cur_length++;
                next_num++;
            }
            longest_length = Math.max(longest_length, cur_length);
        }

        return longest_length;
    }
}
