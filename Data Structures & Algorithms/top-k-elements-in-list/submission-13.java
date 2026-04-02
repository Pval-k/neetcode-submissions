class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for(int num : nums){
            hash.putIfAbsent(num,0);
            hash.put(num,hash.get(num)+1);
        }

        for(Map.Entry<Integer, Integer> set : hash.entrySet()){
            freq[set.getValue()].add(set.getKey());
        }
        int[] answer = new int[k];
        int index = 0;
        for(int i = freq.length-1; i > 0; i--){
            for(int num : freq[i]){
                answer[index] = num;
                index++;
                if(index == k){
                    return answer;
                }
            }
        }

        return answer;
    }
}
// Last element represents most freq, sorted by values not key:
//Then get into the smaller array to add: freq[set.getValue()].add(set.getKey());
//must create new array inside each element of the array